package OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.life;

import java.util.concurrent.CopyOnWriteArrayList;

import OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.analysis.WorkAnalysisIssues;
import OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.management.WorkManagementIssues;
import OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.operation.WorkOperationIssues;
import OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.process.WorkProcessIssues;

public class WorkIssues{
	public void workDefinition() {

	}
	public void workImplementation() {

	}
	public void workCombination() {

	}
	public void workExtension() {

	}
	public void workAckquisition() {

	}
	public void philosothon(CopyOnWriteArrayList<String> read) {
		//a
		new WorkAnalysisIssues().vpcsInitons();
		//o
		new WorkOperationIssues().vpcsInitons();
		//p
		new WorkProcessIssues().vpcsInitons();
		//m
		new WorkManagementIssues().vpcsInitons();
	}
}