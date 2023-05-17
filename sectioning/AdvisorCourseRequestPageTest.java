package org.unitime.timetable.gwt.client.sectioning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.unitime.timetable.gwt.shared.OnlineSectioningInterface.AdvisingStudentDetails;

class AdvisorCourseRequestPageTest {
	

	@Test
	void testNull() {
		AdvisorCourseRequestsPage p=new AdvisorCourseRequestsPage();
		AdvisingStudentDetails result = new AdvisingStudentDetails();
	    assertNull(result);
	    

		
	}

}
