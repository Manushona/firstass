package com.paramedutech.project;

public class HandlingExcel {

	public static void main(String[] args) {
		public static List<Object> readExcel() throws IOException {
			// if your excel is type xlsx you have replace HSSF with XSSF
			List<Object> list = new ArrayList<Object>();
			File file = new File("src/test/resources/testdatafile.xls");
			FileInputStream fileInputStream = new FileInputStream(file);

			HSSFWorkbook hssfWorkbook = new HSSFWorkbook(fileInputStream);

			HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0);

			int lastRowNum = hssfSheet.getLastRowNum();

			for (int i = 1; i <= lastRowNum; i++) {
				HSSFRow row = hssfSheet.getRow(i);
				int lastCellNum = row.getLastCellNum();
				for (int j = 0; j < lastCellNum; j++) {
					if (row.getCell(j).getCellType().equals(CellType.STRING)) {
						list.add(row.getCell(j).getStringCellValue());
					}

					if (row.getCell(j).getCellType().equals(CellType.NUMERIC)) {
						list.add((int) row.getCell(j).getNumericCellValue());
					}
				}
			}
			hssfWorkbook.close();
			return list;
		}


	}

}
