package com.xh.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Color;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.util.StringUtils;


@SuppressWarnings("all")
public class ExcelUtils {
	
	public static class CellData{
		
		private short fontHeight = 12;//字体大小
		
		private short foregroundColor;//cell前景颜色
		
		private short backgroundColor;//cell背景色
		
		private short alignment = HSSFCellStyle.ALIGN_CENTER;//横向位置
		
		private String title ;//cell标题
		
		private String content;//cell文字内容
		
		private Integer columnWidth;//cell的宽度

		public short getFontHeight() {
			return fontHeight;
		}

		public void setFontHeight(short fontHeight) {
			this.fontHeight = fontHeight;
		}

		public short getForegroundColor() {
			return foregroundColor;
		}

		public void setForegroundColor(short foregroundColor) {
			this.foregroundColor = foregroundColor;
		}

		public short getBackgroundColor() {
			return backgroundColor;
		}

		public void setBackgroundColor(short backgroundColor) {
			this.backgroundColor = backgroundColor;
		}

		public short getAlignment() {
			return alignment;
		}

		public void setAlignment(short alignment) {
			this.alignment = alignment;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Integer getColumnWidth() {
			return columnWidth;
		}

		public void setColumnWidth(Integer columnWidth) {
			this.columnWidth = columnWidth;
		}
		
	}
	
	public static class ExcelSheet {
		
		private String sheetName;//sheet名称
		private List<String> sheetTableTitle;//sheet内容的表头内容
		private List<List<String>> sheetTableContent;//sheet的表内容
		
		private List<CellData> sheetWithStyleTitle = new ArrayList<ExcelUtils.CellData>();//拥有属性的标头内容
		private List<List<CellData>> sheetWithStyleContent = new ArrayList<List<CellData>>(2<<4);;//拥有属性的内容
		
		public String getSheetName() {
			return sheetName;
		}
		public void setSheetName(String sheetName) {
			this.sheetName = sheetName;
		}
		public List<String> getSheetTableTitle() {
			if(sheetTableTitle==null)
				return new ArrayList<String>();
			return sheetTableTitle;
		}
		public void setSheetTableTitle(List<String> sheetTableTitle) {
			this.sheetTableTitle = sheetTableTitle;
		}
		public List<List<String>> getSheetTableContent() {
			if( sheetTableContent == null )
				return new ArrayList<List<String>>();
			return sheetTableContent;
		}
		public void setSheetTableContent(List<List<String>> sheetTableContent) {
			this.sheetTableContent = sheetTableContent;
		}
		public List<CellData> getSheetWithStyleTitle() {
			if( sheetWithStyleTitle == null ){
				return new ArrayList<ExcelUtils.CellData>();
			}
			return sheetWithStyleTitle;
		}
		public void setSheetWithStyleTitle(List<CellData> sheetWithStyleTitle) {
			this.sheetWithStyleTitle = sheetWithStyleTitle;
		}
		public List<List<CellData>> getSheetWithStyleContent() {
			if(sheetWithStyleContent == null)
				return new ArrayList<List<CellData>>(2<<4);
			return sheetWithStyleContent;
		}
		public void setSheetWithStyleContent(List<List<CellData>> sheetWithStyleContent) {
			this.sheetWithStyleContent = sheetWithStyleContent;
		}
	}
	
	private static String getCellValue(Cell cell) {
		String ret = new String();
		switch (cell.getCellType()) {
			case Cell.CELL_TYPE_STRING:
				ret = cell.getStringCellValue();
				break;
			case Cell.CELL_TYPE_BLANK:
				break;
			case Cell.CELL_TYPE_BOOLEAN:
				ret = String.valueOf(cell.getBooleanCellValue());
				break;
			case Cell.CELL_TYPE_NUMERIC:
				ret = String.valueOf(cell.getNumericCellValue());
			default:
				break;
		}
		
		return ret;
	}

	/**
	 * 导出excel
	 * @param sheetList
	 * @param fileName
	 * @param response
	 */
	public static void generateExcelWithStyle(List<ExcelSheet> sheetList,OutputStream out) {
		try {
			HSSFWorkbook wb = new HSSFWorkbook();//创建WorkBook
	
			HSSFCellStyle cellStyle=wb.createCellStyle();   
			cellStyle.setBorderBottom((short)1);    //设置边框样式
			cellStyle.setBorderLeft((short)1);     //左边框
			cellStyle.setBorderRight((short)1);    //右边框
			cellStyle.setBorderTop((short)1);    //顶边框
			//cellStyle.setWrapText(true);	//设置自动换行
			cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 居中
			
			HSSFFont cellfont = wb.createFont();
			cellfont.setFontName("Courier New");//设置字体
			cellStyle.setFont(cellfont);
			
			
			for (ExcelSheet st : sheetList){	//遍历ExcelSheet
				
				if( st == null ) continue;
				
				HSSFSheet sheet = wb.createSheet(st.getSheetName());	//创建Excel的sheet
				sheet.setDefaultColumnWidth(22);
				
				HSSFRow rowTitle = sheet.createRow((int) 0);//在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
				rowTitle.setHeight((short)380);
				
				//获取表头信息
				int len = st.getSheetWithStyleTitle().size();
				for (int i =0; i< len ;i++){
					//sheet.autoSizeColumn(i, true);
					
					//创建单元格，并设置值表头 设置表头居中
					HSSFCell cell = rowTitle.createCell(i);
					cell.setCellValue( st.getSheetWithStyleTitle().get(i).getContent() );
					
					HSSFCellStyle style = wb.createCellStyle();
					HSSFFont font = wb.createFont();
					font.setFontHeightInPoints((short)12);// 字体大小   
					font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
					font.setFontName("Courier New");
					
					style.setBorderBottom((short)1);    //设置边框样式
					style.setBorderLeft((short)1);     //左边框
					style.setBorderRight((short)1);    //右边框
					style.setBorderTop((short)1);    //顶边框
					//style.setWrapText(true);	//设置自动换行
					style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 居中
					style.setFont(font);
					cell.setCellStyle(style);
				}
				
				
				int step = 0;//设置内容的起始行位置
				if( st.getSheetWithStyleTitle() != null && len > 0 )
					step = 1;
				
				//写入实体数据 实际应用中这些数据从数据库得到，
				for (int i = 0; i < st.getSheetWithStyleContent().size(); i++){
					HSSFRow row = sheet.createRow( (int) i + step );
					row.setHeight((short)320);//设置行高
					
					List<CellData> lineContent = st.getSheetWithStyleContent().get(i);
					for (int j = 0; j < lineContent.size(); j++){
						//sheet.autoSizeColumn(j, true);
						CellData cellData = lineContent.get(j);
						HSSFCell cell = row.createCell((short) j);
						
						cell.setCellValue(cellData.getContent());
						cell.setCellStyle(cellStyle);
					}
				}
			}
				
			wb.write(out);
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	public static void main(String[] args) throws Exception {
		
		ExcelUtils.ExcelSheet sheet = new ExcelUtils.ExcelSheet();
		sheet.setSheetName("档案列表");
			 	 	 		
		List<CellData> cellList = new ArrayList<CellData>();
		CellData id = new CellData();
		id.setContent("ID");
		cellList.add(id);
		
		CellData name = new CellData();
		name.setContent("姓名");
		cellList.add(name);
		
		CellData idcart = new CellData();
		idcart.setContent("身份证号");
		cellList.add(idcart);
		
		CellData gender = new CellData();
		gender.setContent("性别");
		cellList.add(gender);
		
		CellData birthday = new CellData();
		birthday.setContent("出生日期");
		cellList.add(birthday);
		
		CellData nation = new CellData();
		nation.setContent("民族");
		cellList.add(nation);
		
		sheet.setSheetWithStyleTitle(cellList);
		
		List<List<CellData>> contentList = new ArrayList<List<CellData>>();
		List<CellData> content = new ArrayList<CellData>();
		
		CellData _id = new CellData();
		birthday.setContent("1");
		content.add(birthday);
		
		
		CellData _name = new CellData();
		_name.setContent("唐燕");
		content.add(_name);
		
		CellData _idcart = new CellData();
		_idcart.setContent("61242919901106196X");
		content.add(_idcart);
		
		CellData _gender = new CellData();
		_gender.setContent("女");
		content.add(_gender);
		
		CellData _birthday = new CellData();
		_birthday.setContent("1990-11-06");
		content.add(_birthday);
		
		CellData _nation = new CellData();
		_nation.setContent("汉");
		content.add(_nation);
		
		contentList.add(content);
		sheet.setSheetWithStyleContent(contentList);
		
		
		List<ExcelUtils.ExcelSheet> sheetList = new ArrayList<ExcelUtils.ExcelSheet>();
		sheetList.add(sheet);
		ExcelUtils.generateExcelWithStyle(sheetList, new FileOutputStream(new File("D:/1.xls")));
		
	}
	
}
