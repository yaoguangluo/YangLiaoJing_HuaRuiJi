package OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.life;

import java.util.concurrent.CopyOnWriteArrayList;

import OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.analysis.HelpAnalysisIssues;
import OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.management.HelpManagementIssues;
import OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.operation.HelpOperationIssues;
import OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.process.HelpProcessIssues;

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