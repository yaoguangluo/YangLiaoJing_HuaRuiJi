package OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.tin.life;

import java.util.concurrent.CopyOnWriteArrayList;

import OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.tin.analysis.SafeAnalysisIssues;
import OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.tin.management.SafeManagementIssues;
import OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.tin.operation.SafeOperationIssues;
import OSI.OSU.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.tin.process.SafeProcessIssues;

public class SafeIssues{
	public void safeDefinition() {

	}
	public void safeImplementation() {

	}
	public void safeCombination() {

	}
	public void safeExtension() {

	}
	public void safeAckquisition() {

	}
	public void philosothon(CopyOnWriteArrayList<String> read) {
		//a
		new SafeAnalysisIssues().vpcsInitons();
		//o
		new SafeOperationIssues().vpcsInitons();
		//p
		new SafeProcessIssues().vpcsInitons();
		//m
		new SafeManagementIssues().vpcsInitons();
	}
}