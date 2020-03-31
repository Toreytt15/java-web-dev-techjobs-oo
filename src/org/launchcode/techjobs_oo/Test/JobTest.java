package org.launchcode.techjobs_oo.Test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    private Job job1;
    private Job job2;
    private Job test_job1;
    private Job test_job2;
    private Job test_job3;
    @Before
    public void createJobObject(){
        job1 = new Job();
        job2 = new Job();
        test_job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job3 =new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
    }

    @Test
    public void settingUniqueIdFields(){
        assertFalse(job1.equals(job2 ));
    }

    @Test
    public void idFieldIsSet(){
        assertEquals(job1.getId(),1);
    }

    @Test
    public void idFieldsDifferByOne(){ assertTrue(job2.getId()-job1.getId()==1);}

    @Test
    public void nameFieldSet(){assertTrue(test_job1.getName()=="Product tester");}

    @Test
    public void employerFieldSet(){assertTrue(test_job1.getEmployer() instanceof Employer);}

    @Test
    public void locationFieldSet(){assertTrue(test_job1.getLocation() instanceof Location);}

    @Test
    public void positionTypeSet(){
        assertTrue(test_job1.getPositionType() instanceof PositionType);
        assertEquals("Quality control", test_job1.getPositionType().getValue());
    }

    @Test
    public void  coreCompetencySet(){
        assertTrue(test_job1.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", test_job1.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality (){
        assertFalse(job1.equals(job2));
    }

    @Test
    public void toStringReturnsBlankLines(){
       assertEquals("\n\n",test_job1.toString() );
   }

   @Test
    public void toStringReturn(){
        assertEquals("\n" + "ID: 3\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n",test_job1.toString());
    }

    @Test
    public void testEmptyJob(){
        assertEquals("\n" + "ID: 5\n" +
                "Name: Data not available\n" +
                "Employer: Data not available\n" +
                "Location: Data not available\n" +
                "Position Type: Data not available\n" +
                "Core Competency: Data not available\n",test_job3.toString());
    }




}

