package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job test_job;
    Job test_job1;
    Job empty_test_job3;
    Job empty_test_job4;
    Job test3_job1;
    Job test3_job2;
    Job test3_job3;
    @Before
    public void createJobObject(){
        empty_test_job3=new Job();
        empty_test_job4=new Job();
        test_job=new Job("FullStackWebDeveloper",
                new Employer("Bayer"),
                new Location("Chesterfield"),
                new PositionType("Front end Developer"),
                new CoreCompetency("Java"));

        test_job1=new Job("DataScientist",
                new Employer("Bayer"),
                new Location("Chesterfield"),
                new PositionType("MLEngineer"),
                new CoreCompetency("Python"));

        test3_job1 = new Job("DataScientist",
                new Employer("Centene"),
                new Location("Clayton"),
                new PositionType("MLEngineer"),
                new CoreCompetency("Python"));

        test3_job2 = new Job("DataScientist",
                new Employer("Centene"),
                new Location("Clayton"),
                new PositionType("MLEngineer"),
                new CoreCompetency("Python"));

        test3_job3 = new Job("",
                new Employer(""),
                new Location(""),
                new PositionType(""),
                new CoreCompetency(""));
    }
    //Test1
    @Test
    public void testSettingJobId(){
//        assertEquals(1,empty_test_job3.getId());
//        System.out.println(empty_test_job3.getId());
//        assertEquals(2,empty_test_job4.getId());
        assertTrue(empty_test_job4.getId()>empty_test_job3.getId());
    }
    //Test2
    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals("FullStackWebDeveloper",test_job.getName());
        assertEquals("Bayer",test_job.getEmployer().getValue());
        assertEquals("Chesterfield",test_job.getLocation().getValue());
        assertEquals("Front end Developer",test_job.getPositionType().getValue());
        assertEquals("Java",test_job.getCoreCompetency().getValue());
    }
    //Test3
    @Test
    public void testJobsForEquality() {
        //assertFalse(test3_job1.getId() == test3_job2.getId());
        assertFalse(test3_job1.equals(test3_job2));
    }

    @Test
    public void testStringOutput() {
        assertEquals(true,test3_job1.toString().startsWith("\n"));
        assertEquals(true,test3_job1.toString().endsWith("\n"));
    }

    @Test
    public void testtoStringBlanks() {
        assertEquals(true,test3_job3.toString().contains("Name: Data not available"));
        assertEquals(true,test3_job3.toString().contains("Employer: Data not available"));
        assertEquals(true,test3_job3.toString().contains("Location: Data not available"));
        assertEquals(true,test3_job3.toString().contains("Position Type: Data not available"));
        assertEquals(true,test3_job3.toString().contains("Core Competency: Data not available"));

    }


    @Test
    public void totalJobtoStringOutput() {
        assertEquals("\nID: 5\nName: DataScientist\nEmployer: Centene\nLocation: Clayton\nPosition Type: MLEngineer\nCore Competency: Python\n",
                        test3_job1.toString());
    }
}
