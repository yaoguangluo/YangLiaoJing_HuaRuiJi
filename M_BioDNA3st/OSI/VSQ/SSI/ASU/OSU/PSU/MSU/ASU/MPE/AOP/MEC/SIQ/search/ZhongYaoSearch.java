package OSI.VSQ.SSI.ASU.OSU.PSU.MSU.ASU.MPE.AOP.MEC.SIQ.search;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import ESU.list.List_ESU;
import ESU.sort.Quick9DLYGWithString_ESU;
import ME.APM.VSQ.App;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.TokenPDI;
//作者 罗瑶光
//思想 元基肽展公式
public class ZhongYaoSearch{
	public void zhongYaoSearch(App app, String zhongyao, String forE, String key) {
		String CatalyticDNA_xingwei= "";
		String CatalyticDNA_gongxiao= "";
		if(app.DNASearchIsClick) {
			TokenPDI pDE_RNA_Formular= new TokenPDI();
			double rate= ((double)app.催化比值rot)/ 100;
			//pDE_RNA_Formular.key[0]= 0.3;
			pDE_RNA_Formular.key[1]= rate;
			pDE_RNA_Formular.key[2]= rate;
			//pDE_RNA_Formular.key[3]= 0.3;
			if(null!= app.nameFeelFilter.getText()) {
				pDE_RNA_Formular.pdw= app.nameFeelFilter.getText().toUpperCase();
				pDE_RNA_Formular.code= pDE_RNA_Formular.pdw.toString().toUpperCase();
				pDE_RNA_Formular.doKeyPress(pDE_RNA_Formular.code, pDE_RNA_Formular, false);		
				CatalyticDNA_xingwei= null== pDE_RNA_Formular.pde?"": pDE_RNA_Formular.pde.toString();
			}
			//
			pDE_RNA_Formular.pde= "";
			if(null!= app.name_filter_not_have.getText()) {
				pDE_RNA_Formular.pdw= app.name_filter_not_have.getText().toUpperCase();
				pDE_RNA_Formular.code= pDE_RNA_Formular.pdw.toString().toUpperCase();
				pDE_RNA_Formular.doKeyPress(pDE_RNA_Formular.code, pDE_RNA_Formular, false);		
				CatalyticDNA_gongxiao= null== pDE_RNA_Formular.pde?"": pDE_RNA_Formular.pde.toString();		
			}
		}
		String[] score= new String[app.copy.size()];
		int[] score_code= new int[app.copy.size()];
		double []reg= new double[app.copy.size()];
		int count= 0;
		Map<String, WordFrequency> mapSearchWithoutSort= null;
		if(app.dic_map.containsKey(zhongyao.replaceAll(" ", ""))) {
			mapSearchWithoutSort= app._A.parserMixStringByReturnFrequencyMap(zhongyao);	
		}else {
			String[] strings= key.split(" ");
			if(strings.length> 1&& key.split(" ")[0].length()> 5) {
				mapSearchWithoutSort= app._A.parserMixStringByReturnFrequencyMap(key);
			}else {
				mapSearchWithoutSort= app._A.parserMixStringByReturnFrequencyMap(zhongyao);	
			}
		}	
		Iterator<String> iteratorForCopy= app.copy.iterator();	
		int copyCount= 0;
		List<String> list= app._A.parserMixedString(key);
		String[] string= List_ESU.listToArray(list);

		String[] stringReg= new String[forE.length()/ 3];
		for(int i= 0; i< stringReg.length; i++) {
			stringReg[i]= forE.substring(i* 3, (i* 3+ 3)< forE.length()? (i* 3+ 3): forE.length()- 1);
		}
		while(iteratorForCopy.hasNext()) {
			String iteratorForCopyString= iteratorForCopy.next();
			score[copyCount]= iteratorForCopyString;
			String temps= app.dic_map.get(iteratorForCopyString).toString();
			String tempsPCA= app.dic_li.get(iteratorForCopyString).toString();
		//	String tempsIndex= app.dic_index.get(iteratorForCopyString).toString();
			Iterator<String> iteratorWordFrequency= mapSearchWithoutSort.keySet().iterator();
			Here:
				while(iteratorWordFrequency.hasNext()) {  
					String mapSearchaAtII = iteratorWordFrequency.next();
					WordFrequency wordFrequencySearch = mapSearchWithoutSort.get(mapSearchaAtII);
					if(temps.contains(mapSearchaAtII)) {
						if(reg[copyCount] == 0){
							count += 1;
						}
						if(score[copyCount].contains(zhongyao.replace(" ", ""))) {
							reg[copyCount]+= 12;
						}
						if(zhongyao.contains(score[copyCount].replace(" ", ""))) {
							reg[copyCount]+= 12;
						}
//因为这几行是新电脑开发的只有3行数据测试,老电脑写的拼音索引没用到,就出现这个问题,我先注释掉,以后优化. 罗瑶光20210516
//						if(tempsIndex.equalsIgnoreCase(zhongyao.replace(" ", ""))) {
//							reg[copyCount]+= 1200;
//						}
//						if(tempsIndex.contains(zhongyao.replace(" ", "").toUpperCase())) {
//							reg[copyCount]+= 1200;
//						}

						score[copyCount]= iteratorForCopyString;
						if(!app.pos.containsKey(mapSearchaAtII)) {
							reg[copyCount]+= 1;
							score_code[copyCount]+= 1<< mapSearchaAtII.length()
									<< wordFrequencySearch.getFrequency() ;
							if(tempsPCA.contains(mapSearchaAtII)) {
								score_code[copyCount] *= 2;
							}
							if(score[copyCount].contains(mapSearchaAtII)) {
								if(score[copyCount].length()>1) {
									reg[copyCount]+= 22;
								}
								reg[copyCount]+= 3;
							}
							continue Here;
						}
						if(app.pos.get(mapSearchaAtII).contains("名")|| app.pos.get(mapSearchaAtII).contains("动")
								|| app.pos.get(mapSearchaAtII).contains("形")|| app.pos.get(mapSearchaAtII).contains("谓")) {
							reg[copyCount]+= 2;
							if(tempsPCA.contains(mapSearchaAtII)) {
								reg[copyCount]*= 2;
							}
						}
						reg[copyCount]+= 1;
						score_code[copyCount]+= (iteratorForCopyString.contains(mapSearchaAtII)? 2: 1) 
								* (!app.pos.get(mapSearchaAtII).contains("名")? app.pos.get(mapSearchaAtII).contains("动")? 10: 1: 150) 
								<< mapSearchaAtII.length()* wordFrequencySearch.getFrequency();
						if(score[copyCount].contains(mapSearchaAtII)) {
							if(score[copyCount].length()>1) {
								reg[copyCount]+= 22;
							}
							reg[copyCount]+= 3;
						}
						continue Here;
					}
					if(mapSearchaAtII.length()>1) {
						for(int j=0;j<mapSearchaAtII.length();j++) {
							if(temps.contains(String.valueOf(mapSearchaAtII.charAt(j)))) {
								if(reg[copyCount] == 0){
									count += 1;
								}
								score[copyCount] = iteratorForCopyString;
								score_code[copyCount]+=1;
								if(app.pos.containsKey(String.valueOf(mapSearchaAtII.charAt(j)))&&(
										app.pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("名")
										||app.pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("动")
										||app.pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("形")
										||app.pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("谓")
										)) {
									reg[copyCount] += 2;
								}
								reg[copyCount] += 1;
								if(score[copyCount].contains(mapSearchaAtII)) {
									if(score[copyCount].length()>1) {
										reg[copyCount]+= 12;
									}
									reg[copyCount]+= 3;
								}
								continue Here;
							}
						}
					}
				}
			score_code[copyCount] = score_code[copyCount] * (int)reg[copyCount];
			//词距
			int code= 200;
			int tempb= 0;
			int tempa= score_code[copyCount];
			if(key.length()> 6) {
				//全词
				for(int i= 0; i< string.length; i++) {
					if(temps.contains(string[i])) {
						tempb+= code;
					}
				}
				//断句
				for(int i= 0; i< stringReg.length; i++) {
					if(temps.contains(stringReg[i])) {
						tempb+= code;
					}
				}
				score_code[copyCount] = (int) (tempa/Math.pow(app.lookrot+ 1, 4) + tempb*Math.pow(app.lookrot, 2));
			}
			if(zhongyao.replace(" ", "").length()> 1&& zhongyao.replace(" ", "").length()< 5) {
				if(temps.contains(zhongyao.replace(" ", ""))) {
					tempb+= code<< 7;
				}
				score_code[copyCount] = (int) (tempa/Math.pow(app.lookrot+ 1, 4) + tempb*Math.pow(app.lookrot, 2));
			}
			copyCount++;
		}
		new Quick9DLYGWithString_ESU().sort(score_code, score);
		Object[][] tableData= new Object[count][13];
		int new_count = 0;
		app.newTableModel.getDataVector().clear();
		if(null== key|| key.equals("")) {
			for(int i= 0; i < app.tableData_old.length; i++) {
				app.tableData_old[i][6]= app.tableData_old[i][6]==null? "": app.tableData_old[i][6];
				app.newTableModel.insertRow(i, app.tableData_old[i]);
			}		
			app.newTableModel.fireTableDataChanged();	
			return;
		}
		Here:
			for(int i = app.copy.size()-1; i > -1; i--) {
				if(score_code[i]< 1){
					continue Here;
				}
				if(app.risk_filter_box.isSelected()) {
					String hai= (app.dic_hai.get(score[i])== null? "null."
							: app.dic_hai.get(score[i]).toString().replaceAll("\\s*", "")
							.equalsIgnoreCase("")? "null": app.dic_hai.get(score[i]).toString()
									.replaceAll("\\s*", ""));
					String temp= app.name_filter.getText();
					for(int j=0;j<temp.length();j++) {
						if(hai.contains(""+ temp.charAt(j))) {
							continue Here;
						}	
					}
				}
				if(app.feel_filter_box.isSelected()) {
					String li= (app.dic_li.get(score[i])== null? "null."
							: app.dic_li.get(score[i]).toString().replaceAll("\\s*", "")
							.equalsIgnoreCase("")?"null": app.dic_li.get(score[i]).toString()
									.replaceAll("\\s*", ""));
					String temp= app.name_filter.getText();
					for(int j= 0; j< temp.length(); j++) {
						if(li.contains(""+ temp.charAt(j))) {
							continue Here;
						}	
					}
				}
				//催化比值rot dna 催化计算
				if(!app.nameFeelFilter.getText().isEmpty()) {
					String wei= app.dic_xw.get(score[i]).toString().replaceAll("\\s*", "");
					CatalyticDNA_xingwei+= app.nameFeelFilter.getText().replace(" ", "");
					for(int j= 0; j< CatalyticDNA_xingwei.length(); j++) {
						if(wei.contains(""+ CatalyticDNA_xingwei.charAt(j))) {
							continue Here;
						}	
					}
				}
				if(null!= app.name_filter_not_have.getText()) {
					if(!app.name_filter_not_have.getText().replace(" ", "").isEmpty()) {
						String wei= app.dic_jm.get(score[i]).toString().replaceAll("\\s*", "");
						CatalyticDNA_gongxiao+= app.name_filter_not_have.getText().replace(" ", "");
						for(int j= 0; j< CatalyticDNA_gongxiao.length(); j++) {
							if(!wei.contains(""+ CatalyticDNA_gongxiao.charAt(j))) {
								continue Here;
							}
						}
					}
				}
				if(app.shuming_filter_box.isSelected()) {
					String wei= score[i];
					String temp= app.name_filter.getText();
					for(int j= 0; j< temp.length(); j++) {
						if(wei.contains(""+ temp.charAt(j))) {
							continue Here;
						}	
					}
				}
				String temp= app.dic_map.get(score[i]).toString();
				if(tableData.length<= new_count) {
					continue Here;
				}
				tableData[new_count]= new Object[]{
						(app.dic_index.get(score[i])== null? "": app.dic_index.get(score[i])).toString().replaceAll("\\s*", ""), 
						score_code[i], score[i],
						(app.dic_yw.get(score[i])== null? "": app.dic_yw.get(score[i])).toString().replaceAll("\\s*", ""), 
						(app.dic_li.get(score[i])== null? "": app.dic_li.get(score[i])).toString().replaceAll("\\s*", ""), 
						(app.dic_hai.get(score[i])==null?"详情参考笔记原文列: 是药三分毒, 补药甚三分. 食材亦如此, 勤俭亦长生."
								:app.dic_hai.get(score[i]).toString().replaceAll("\\s*", "").equalsIgnoreCase("")?"详情参考笔记原文列"
										:app.dic_hai.get(score[i]).toString().replaceAll("\\s*", "")), 				
						(app.dic_yl.get(score[i])==null?"详情参考相关书籍":app.dic_yl.get(score[i])).toString().replaceAll("\\s*", ""),
						(app.dic_xw.get(score[i])== null? "": app.dic_xw.get(score[i])).toString().replaceAll("\\s*", ""), 
						(app.dic_jm.get(score[i])== null? "": app.dic_jm.get(score[i])).toString().replaceAll("\\s*", ""), 	
						(app.dic_xz.get(score[i])==null?"":app.dic_xz.get(score[i])).toString().replaceAll("\\s*", ""), 
						(app.dic_jj.get(score[i])==null?"":app.dic_jj.get(score[i])).toString().replaceAll("\\s*", ""), 
						(app.dic_cy.get(score[i])==null?"":app.dic_cy.get(score[i])).toString().replaceAll("\\s*", ""),
						(app.dic_ya.get(score[i])==null?"":app.dic_ya.get(score[i])).toString().replaceAll("\\s*", ""), 
						(app.dic_zf.get(score[i])==null?"":app.dic_zf.get(score[i])).toString().replaceAll("\\s*", ""),
						(app.dic_cj.get(score[i])==null?"":app.dic_cj.get(score[i])).toString().replaceAll("\\s*", "")};
				if(zhongyao.contains("风寒")) {
					if(temp.contains("风寒")) {
						app.newTableModel.insertRow(new_count, tableData[new_count]);
						new_count += 1;
					}
				}else if(zhongyao.contains("风热")){
					if(temp.contains("风热")) {
						app.newTableModel.insertRow(new_count, tableData[new_count]);
						new_count += 1;
					}		
				}else {
					app.newTableModel.insertRow(new_count, tableData[new_count]);
					new_count+=1;
				}		 
			}	
		app.newTableModel.fireTableDataChanged();
	}
}

	