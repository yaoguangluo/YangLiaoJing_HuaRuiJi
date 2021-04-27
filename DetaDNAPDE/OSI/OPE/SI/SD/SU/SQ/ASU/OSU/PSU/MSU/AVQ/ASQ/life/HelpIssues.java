package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.life;

import java.util.concurrent.CopyOnWriteArrayList;

import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.PP.HelpProcessIssues;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.analysis.HelpAnalysisIssues;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.management.HelpManagementIssues;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.operation.HelpOperationIssues;

public class HelpIssues{
	public void helpDefinition() {

	}
	public void helpImplementation() {

	}
	public void helpCombination() {

	}
	public void helpExtension() {

	}
	public void helpAckquisition() {

	}
	public void philosothon(CopyOnWriteArrayList<String> read) {
		//a
		new HelpAnalysisIssues().vpcsInitons();
		//o
		new HelpOperationIssues().vpcsInitons();
		//p
		new HelpProcessIssues().vpcsInitons();
		//m
		new HelpManagementIssues().vpcsInitons();
	}
}