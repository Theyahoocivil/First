package org.login;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report {

public static void generateReport(String report) {
	File file = new File("C:\\Users\\thiyagarajan\\Desktop\\workspace\\Ba\\target");
	Configuration con = new Configuration(file, "FirstProduct");
	con.addClassifications("UserName","Thiyagu");
	List<String> li = new LinkedList<String>();
	li.add(report);
	ReportBuilder r = new ReportBuilder(li, con);
	r.generateReports();









}

}
