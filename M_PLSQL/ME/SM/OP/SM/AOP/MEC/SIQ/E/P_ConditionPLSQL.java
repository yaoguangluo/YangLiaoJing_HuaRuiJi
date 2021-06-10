package ME.SM.OP.SM.AOP.MEC.SIQ.E;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import MS.OP.SM.AOP.MEC.SIQ.cache.DetaDBBufferCacheManager;
import OP.SM.AOP.MEC.SIQ.SM.reflection.Cell;
import OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
import OP.SM.AOP.MEC.SIQ.SM.reflection.Table;
@SuppressWarnings({ "unused", "unchecked"})
public class P_ConditionPLSQL {
	public static void P_Cache(String[] sets, List<Map<String, Object>> output
			, String tableName, String baseName, Map<String, Object> object) {
		Table table = DetaDBBufferCacheManager.db.getBase(baseName).getTable(tableName);
		Iterator<String> iterator = table.getRows().keySet().iterator(); 
		int rowindex=0;
		while(iterator.hasNext()) {
			int count = rowindex++;
			String rowIndex = iterator.next();
			Row row = table.getRow(rowIndex);
			Cell cell=new Cell();
			cell.setCellValue(rowIndex.replace("row", ""));
			row.putCell("Index", cell);
			if(sets[1].equalsIgnoreCase("<")||sets[1].equalsIgnoreCase("-lt")) {
				double rowCellFromBigDecimal = new BigDecimal(row.getCell(sets[0])
						.getCellValue().toString()).doubleValue();
				if(rowCellFromBigDecimal < new BigDecimal(sets[2]).doubleValue() 
						&& row.containsCell("is_delete_0")) {
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
						output.add(rowToRowMap(row));
						Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(count, true);
					}
				}	
			}
			if(sets[1].equalsIgnoreCase("<=")||sets[1].equalsIgnoreCase("=<")
					||sets[1].equalsIgnoreCase("-lte")) {
				
				String set= sets[0];
				Cell setCell= row.getCell(set);
				String cellString= setCell.getCellValue().toString();
				cellString=cellString.isEmpty()? "0": cellString;
				double rowCellFromBigDecimal = new BigDecimal(cellString).doubleValue();
				if(rowCellFromBigDecimal<=  new BigDecimal(sets[2]).doubleValue() 
						&& row.containsCell("is_delete_0")) {
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
						output.add(rowToRowMap(row));
						Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(count, true);
					}
				}	
			}
			if(sets[1].equalsIgnoreCase("==")||sets[1].equalsIgnoreCase("=")
					||sets[1].equalsIgnoreCase("===")) {
				double rowCellFromBigDecimal = new BigDecimal(row.getCell(sets[0])
						.getCellValue().toString()).doubleValue();
				if(rowCellFromBigDecimal ==  new BigDecimal(sets[2]).doubleValue() 
						&& row.containsCell("is_delete_0")) {
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
						output.add(rowToRowMap(row));
						Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(count, true);
					}
				}	
			}
			if(sets[1].equalsIgnoreCase(">=")||sets[1].equalsIgnoreCase("=>") 
					||sets[1].equalsIgnoreCase("-gte")) {
				double rowCellFromBigDecimal = new BigDecimal(row.getCell(sets[0])
						.getCellValue().toString()).doubleValue();
				if(rowCellFromBigDecimal >= new BigDecimal(sets[2]).doubleValue() 
						&& row.containsCell("is_delete_0")) {
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
						output.add(rowToRowMap(row));
						Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(count, true);
					}
				}	
			}
			if(sets[1].equalsIgnoreCase(">")||sets[1].equalsIgnoreCase("-gt")) {
				double rowCellFromBigDecimal = new BigDecimal(row.getCell(sets[0])
						.getCellValue().toString()).doubleValue();
				if(rowCellFromBigDecimal > new BigDecimal(sets[2]).doubleValue() 
						&& row.containsCell("is_delete_0")) {
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
						output.add(rowToRowMap(row));
						Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(count, true);
					}
				}	
			}
			if(sets[1].equalsIgnoreCase("!=")||sets[1].equalsIgnoreCase("=!")) {
				double rowCellFromBigDecimal = new BigDecimal(row.getCell(sets[0])
						.getCellValue().toString()).doubleValue();
				if(rowCellFromBigDecimal != new BigDecimal(sets[2]).doubleValue() 
						&& row.containsCell("is_delete_0")) {
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
						output.add(rowToRowMap(row));
						Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(count, true);
					}
				}	
			}
			if(sets[1].equalsIgnoreCase("equal") && row.containsCell("is_delete_0")) {
				String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
				if(rowCellFromString.equalsIgnoreCase(sets[2])) {
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
						output.add(rowToRowMap(row));
						Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(count, true);
					}
				}	
			}
			if(sets[1].equalsIgnoreCase("!equal")) {
				String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
				if(!rowCellFromString.equalsIgnoreCase(sets[2]) && row.containsCell("is_delete_0")) {
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
						output.add(rowToRowMap(row));
						Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(count, true);
					}
				}	
			}

			if(sets[1].equalsIgnoreCase("in")) {
				String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
				String set = "," + sets[2] + ",";
				if(set.contains("," + rowCellFromString + ",") && row.containsCell("is_delete_0")){
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
						output.add(rowToRowMap(row));
						Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(count, true);
					}
				}	
			}
			if(sets[1].equalsIgnoreCase("!in")) {
				String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
				String set = "," + sets[2] + ",";
				if(!set.contains("," + rowCellFromString + ",") && row.containsCell("is_delete_0")){
					if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
						output.add(rowToRowMap(row));
						Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
						recordRows.put(count, true);
					}
				}	
			}		
		}	
	}

	//以后优化成统一对象输出，不需要再转换。2019-1-15 tin
	private static Map<String, Object> rowToRowMap(Row row) {
		Map<String, Object> culumnMaps = new HashMap<>();
		Map<String, Object> rowMap = new HashMap<>();
		Iterator<String> iterator = row.getCells().keySet().iterator();
		while(iterator.hasNext()) {
			String cellName = iterator.next();
			if(!cellName.contains("is_delete")) {
				Cell cell = row.getCell(cellName);
				Map<String, Object> culumnMap = new HashMap<>();
				culumnMap.put("culumnName", cellName);
				culumnMap.put("culumnValue", cell.getCellValue().toString());
				culumnMaps.put(cellName, culumnMap);
			}
		}
		rowMap.put("rowValue", culumnMaps);	
		return rowMap;
	}

	public static void P_Map(String[] sets, List<Map<String, Object>> output, String dBTablePath) {
		List<Map<String, Object>> outputTemp = new ArrayList<>();
		Iterator<Map<String, Object>> iterator = output.iterator();
		int rowid = 0;
		while(iterator.hasNext()) {
			Map<String, Object> row = iterator.next();
			Map<String, Object> rowMap = new HashMap<>();
			if(sets[1].equalsIgnoreCase("<")||sets[1].equalsIgnoreCase("-lt")) {
				String rowCellFromString = ((Map<String, Object>)(((Map<String, Object>)(row.get("rowValue")))
						.get(sets[0]))).get("culumnValue").toString();
				if(new BigDecimal(rowCellFromString).doubleValue() < new BigDecimal(sets[2]).doubleValue()) {
					outputTemp.add(row);
				}	
			}
			if(sets[1].equalsIgnoreCase("<=")||sets[1].equalsIgnoreCase("=<")
					||sets[1].equalsIgnoreCase("-lte")) {
				String rowCellFromString = ((Map<String, Object>)(((Map<String, Object>)(row.get("rowValue")))
						.get(sets[0]))).get("culumnValue").toString();
				if(new BigDecimal(rowCellFromString).doubleValue() <=  new BigDecimal(sets[2]).doubleValue()) {
					outputTemp.add(row);
				}	
			}
			if(sets[1].equalsIgnoreCase("==")||sets[1].equalsIgnoreCase("=")||sets[1].equalsIgnoreCase("===")) {
				String rowCellFromString = ((Map<String, Object>)(((Map<String, Object>)(row.get("rowValue")))
						.get(sets[0]))).get("culumnValue").toString();
				if(new BigDecimal(rowCellFromString).doubleValue() ==  new BigDecimal(sets[2]).doubleValue()) {
					outputTemp.add(row);
				}	
			}
			if(sets[1].equalsIgnoreCase(">=")||sets[1].equalsIgnoreCase("=>") 
					||sets[1].equalsIgnoreCase("-gte")) {
				String rowCellFromString = ((Map<String, Object>)(((Map<String, Object>)(row.get("rowValue")))
						.get(sets[0]))).get("culumnValue").toString();
				if(new BigDecimal(rowCellFromString).doubleValue() >= new BigDecimal(sets[2]).doubleValue()) {
					outputTemp.add(row);
				}	
			}
			if(sets[1].equalsIgnoreCase(">")||sets[1].equalsIgnoreCase("-gt")) {
				String rowCellFromString = ((Map<String, Object>)(((Map<String, Object>)(row.get("rowValue")))
						.get(sets[0]))).get("culumnValue").toString();
				if(new BigDecimal(rowCellFromString).doubleValue() > new BigDecimal(sets[2]).doubleValue()) {
					outputTemp.add(row);
				}	
			}
			if(sets[1].equalsIgnoreCase("!=")||sets[1].equalsIgnoreCase("=!")) {
				String rowCellFromString = ((Map<String, Object>)(((Map<String, Object>)(row.get("rowValue")))
						.get(sets[0]))).get("culumnValue").toString();
				if(new BigDecimal(rowCellFromString).doubleValue() != new BigDecimal(sets[2]).doubleValue()) {
					outputTemp.add(row);
				}	
			}

			if(sets[1].equalsIgnoreCase("equal")) {
				String rowCellFromString = ((Map<String, Object>)(((Map<String, Object>)(row.get("rowValue")))
						.get(sets[0]))).get("culumnValue").toString();
				if(rowCellFromString.equalsIgnoreCase(sets[2])) {
					outputTemp.add(row);
				}	
			}

			if(sets[1].equalsIgnoreCase("!equal")) {
				String rowCellFromString = ((Map<String, Object>)(((Map<String, Object>)(row.get("rowValue")))
						.get(sets[0]))).get("culumnValue").toString();
				if(!rowCellFromString.equalsIgnoreCase(sets[2])) {
					outputTemp.add(row);
				}	
			}

			if(sets[1].equalsIgnoreCase("in")) {
				String rowCellFromString = ((Map<String, Object>)(((Map<String, Object>)(row.get("rowValue")))
						.get(sets[0]))).get("culumnValue").toString();
				String set = "," + sets[2] + ",";
				if(set.contains("," + rowCellFromString + ",")){
					outputTemp.add(row);
				}	
			}

			if(sets[1].equalsIgnoreCase("!in")) {
				String rowCellFromString = ((Map<String, Object>)(((Map<String, Object>)(row.get("rowValue")))
						.get(sets[0]))).get("culumnValue").toString();
				String set = "," + sets[2] + ",";
				if(!set.contains("," + rowCellFromString + ",")){
					outputTemp.add(row);
				}	
			}
		}
		output.clear();
		output.addAll(outputTemp);
	}
	
	//plsql引擎函数获取表开始检查 罗瑶光 20210405  //奇怪了 这是一个没有读 缓存的plsql引擎,我准备对比下history
	//object 指令堆栈
	//output 数据行
	public static void P_Table(String[] sets, List<Map<String, Object>> output
			, String DBTablePath, Map<String, Object> object) throws IOException {
		String DBTableRowsPath = DBTablePath + "/rows";	
		File fileDBTableRowsPath = new File(DBTableRowsPath);
		if (fileDBTableRowsPath.isDirectory()) {
			String[] rowList = fileDBTableRowsPath.list();
			int count=0;
			NextRow:
				for(String row: rowList) {
					count++;
					Map<String, Object> rowMap = new HashMap<>();
					String DBTableRowIndexPath = DBTablePath + "/rows/" + row;	
					File readDBTableRowIndexFile = new File(DBTableRowIndexPath);
					if (readDBTableRowIndexFile.isDirectory()) {	
						String isDelete = DBTableRowIndexPath + "/is_delete_1" ;	
						File isDeleteFile = new File(isDelete);
						if(isDeleteFile.exists()) {
							continue NextRow;
						}
						String DBTableRowIndexCulumnPath = DBTableRowIndexPath + "/" + sets[0];	
						File readDBTableRowIndexCulumnFile = new File(DBTableRowIndexCulumnPath);
						if(readDBTableRowIndexCulumnFile.isDirectory()) {
							BufferedReader reader = new BufferedReader
									(new FileReader(readDBTableRowIndexCulumnFile + "/" + "value.lyg"));  
							String temp = "";
							String tempString = "";
							while ((tempString = reader.readLine()) != null) {
								temp += tempString;
							}
							reader.close();
							if(temp.isEmpty()) {//增加一行id为空检查, 大家记得给 数据库的id加点值,我lyg的都是空文件.
								continue NextRow;
							}
							if(sets[1].equalsIgnoreCase("<")||sets[1].equalsIgnoreCase("-lt")) {
								if(new BigDecimal(temp.toString()).doubleValue() 
										< new BigDecimal(sets[2].toString()).doubleValue()) {	
									if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
										Row bufferRow= new Row();
										bufferRow.setCells(new ConcurrentHashMap<String, Cell>());
										P_kernel(row, readDBTableRowIndexCulumnFile
												, readDBTableRowIndexFile, reader// 似乎被猫腻哥动了手脚, 我会将手里硬盘数据2年的数据等会全部验算
												, row, output, bufferRow, rowMap);
										output.add(rowToRowMap(bufferRow));
										Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
										recordRows.put(count, true);						
									}
								}	
							}
							if(sets[1].equalsIgnoreCase("<=")||sets[1].equalsIgnoreCase("=<")
									||sets[1].equalsIgnoreCase("-lte")) {
								if(new BigDecimal(temp.toString()).doubleValue() 
										<= new BigDecimal(sets[2].toString()).doubleValue()) {
									if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
										Row bufferRow= new Row();
										bufferRow.setCells(new ConcurrentHashMap<String, Cell>());
										P_kernel(row, readDBTableRowIndexCulumnFile
												, readDBTableRowIndexFile, reader// 似乎被猫腻哥动了手脚, 我会将手里硬盘数据2年的数据等会全部验算
												, row, output, bufferRow, rowMap);
										output.add(rowToRowMap(bufferRow));
										Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
										recordRows.put(count, true);		
									}
								}	
							}
							if(sets[1].equalsIgnoreCase("==")||sets[1].equalsIgnoreCase("=")
									||sets[1].equalsIgnoreCase("===")) {
								if(new BigDecimal(temp.toString()).doubleValue() 
										== new BigDecimal(sets[2].toString()).doubleValue()) {
									if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
										Row bufferRow= new Row();
										bufferRow.setCells(new ConcurrentHashMap<String, Cell>());
										P_kernel(row, readDBTableRowIndexCulumnFile
												, readDBTableRowIndexFile, reader// 似乎被猫腻哥动了手脚, 我会将手里硬盘数据2年的数据等会全部验算
												, row, output, bufferRow, rowMap);
										output.add(rowToRowMap(bufferRow));
										Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
										recordRows.put(count, true);		
									}
								}	
							}
							if(sets[1].equalsIgnoreCase(">=")||sets[1].equalsIgnoreCase("=>") 
									||sets[1].equalsIgnoreCase("-gte")) {
								if(new BigDecimal(temp.toString()).doubleValue() 
										>= new BigDecimal(sets[2].toString()).doubleValue()) {
									if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
										Row bufferRow= new Row();
										bufferRow.setCells(new ConcurrentHashMap<String, Cell>());
										P_kernel(row, readDBTableRowIndexCulumnFile
												, readDBTableRowIndexFile, reader// 似乎被猫腻哥动了手脚, 我会将手里硬盘数据2年的数据等会全部验算
												, row, output, bufferRow, rowMap);
										output.add(rowToRowMap(bufferRow));
										Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
										recordRows.put(count, true);		
									}
								}	
							}
							if(sets[1].equalsIgnoreCase(">")||sets[1].equalsIgnoreCase("-gt")) {
								if(new BigDecimal(temp.toString()).doubleValue() 
										> new BigDecimal(sets[2].toString()).doubleValue()) {
									if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
										Row bufferRow= new Row();
										bufferRow.setCells(new ConcurrentHashMap<String, Cell>());
										P_kernel(row, readDBTableRowIndexCulumnFile
												, readDBTableRowIndexFile, reader// 似乎被猫腻哥动了手脚, 我会将手里硬盘数据2年的数据等会全部验算
												, row, output, bufferRow, rowMap);
										output.add(rowToRowMap(bufferRow));
										Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
										recordRows.put(count, true);		
									}
								}	
							}
							if(sets[1].equalsIgnoreCase("!=")||sets[1].equalsIgnoreCase("=!")) {
								if(new BigDecimal(temp.toString()).doubleValue()
										!= new BigDecimal(sets[2].toString()).doubleValue()) {
									if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
										Row bufferRow= new Row();
										bufferRow.setCells(new ConcurrentHashMap<String, Cell>());
										P_kernel(row, readDBTableRowIndexCulumnFile
												, readDBTableRowIndexFile, reader// 似乎被猫腻哥动了手脚, 我会将手里硬盘数据2年的数据等会全部验算
												, row, output, bufferRow, rowMap);
										output.add(rowToRowMap(bufferRow));
										Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
										recordRows.put(count, true);		
									}
								}	
							}
							if(sets[1].equalsIgnoreCase("equal")) {
								String rowCellFromString = temp.toString();
								if(rowCellFromString.equalsIgnoreCase(sets[2].toString())) {
									if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
										Row bufferRow= new Row();
										bufferRow.setCells(new ConcurrentHashMap<String, Cell>());
										P_kernel(row, readDBTableRowIndexCulumnFile
												, readDBTableRowIndexFile, reader// 似乎被猫腻哥动了手脚, 我会将手里硬盘数据2年的数据等会全部验算
												, row, output, bufferRow, rowMap);
										output.add(rowToRowMap(bufferRow));
										Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
										recordRows.put(count, true);		
									}
								}	
							}
							if(sets[1].equalsIgnoreCase("!equal")) {
								String rowCellFromString = temp.toString();
								if(!rowCellFromString.equalsIgnoreCase(sets[2].toString())) {
									if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
										Row bufferRow= new Row();
										bufferRow.setCells(new ConcurrentHashMap<String, Cell>());
										P_kernel(row, readDBTableRowIndexCulumnFile
												, readDBTableRowIndexFile, reader// 似乎被猫腻哥动了手脚, 我会将手里硬盘数据2年的数据等会全部验算
												, row, output, bufferRow, rowMap);
										output.add(rowToRowMap(bufferRow));
										Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
										recordRows.put(count, true);		
									}
								}	
							}
							if(sets[1].equalsIgnoreCase("in")) {
								String rowCellFromString = temp.toString();
								String set = "," + sets[2] + ",";
								if(set.contains("," + rowCellFromString + ",")) {
									if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
										Row bufferRow= new Row();
										bufferRow.setCells(new ConcurrentHashMap<String, Cell>());
										P_kernel(row, readDBTableRowIndexCulumnFile
												, readDBTableRowIndexFile, reader// 似乎被猫腻哥动了手脚, 我会将手里硬盘数据2年的数据等会全部验算
												, row, output, bufferRow, rowMap);
										output.add(rowToRowMap(bufferRow));
										Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
										recordRows.put(count, true);		
									}
								}	
							}
							if(sets[1].equalsIgnoreCase("!in")) {
								String rowCellFromString = temp.toString();
								String set = "," + sets[2] + ",";
								if(!set.contains("," + rowCellFromString + ",")) {
									if(!((Map<Integer, Boolean>)(object.get("recordRows"))).containsKey(count)) {
										Row bufferRow= new Row();
										bufferRow.setCells(new ConcurrentHashMap<String, Cell>());
										P_kernel(row, readDBTableRowIndexCulumnFile
												, readDBTableRowIndexFile, reader// 似乎被猫腻哥动了手脚, 我会将手里硬盘数据2年的数据等会全部验算
												, row, output, bufferRow, rowMap);
										output.add(rowToRowMap(bufferRow));
										Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
										recordRows.put(count, true);		
									}
								}	
							}
						}
					} 
				}
		}
	}
    
	//比较是否有数据取出列表到输出 检验中 罗瑶光 20210405
	//这个走硬盘查询函数来标识下, 在我设计了数据缓存查询启动函数 后就没用过了, 时间点大概在2019年1月后, 我先调通下, 之后朔源.
	//准备验算下20210406 罗瑶光
	private static void P_kernel(String temp, File readDBTableRowIndexCulumnFile, File readDBTableRowIndexFile
			, BufferedReader reader, String DBTableRowIndexPath, List<Map<String, Object>> output, Row bufferRow
			, Map<String, Object> rowMap) throws IOException {
		String[] culumnList = readDBTableRowIndexFile.list();
		NextFile:
			for(String culumn: culumnList) {
				if(culumn.contains("is_delete")) {
					continue NextFile;
				}
				String DBTableCulumnIndexPath = readDBTableRowIndexFile + "/" + culumn;	
				File readDBTableCulumnIndexPathFile = new File(DBTableCulumnIndexPath);
				
				Cell cell= new Cell();
				if (readDBTableCulumnIndexPathFile.isDirectory()) {
					//似乎被动了手脚, 20210405 罗瑶光重新检查
					reader = new BufferedReader(new FileReader(readDBTableCulumnIndexPathFile + "/" + "value.lyg"));  
					temp = "";
					String tempString;
					while ((tempString = reader.readLine()) != null) {
						temp += tempString;
					}
					reader.close();
					rowMap.put(culumn, temp);
					cell.setCellValue(temp);
					bufferRow.putCell(culumn, cell);
				}else {
					rowMap.put(culumn, null);
					cell.setCellValue(null);
					bufferRow.putCell(culumn, cell);
				}
			}
		output.add(rowMap);
	}
}