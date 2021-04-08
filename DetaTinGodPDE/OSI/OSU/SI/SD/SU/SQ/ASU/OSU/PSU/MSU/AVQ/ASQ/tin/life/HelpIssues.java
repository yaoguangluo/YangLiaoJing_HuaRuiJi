package OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.tin.life;

import java.util.concurrent.CopyOnWriteArrayList;

import OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.tin.analysis.HelpAnalysisIssues;
import OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.tin.management.HelpManagementIssues;
import OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.tin.operation.HelpOperationIssues;
import OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.tin.process.HelpProcessIssues;

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