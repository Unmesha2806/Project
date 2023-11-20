package com.java.employ;

import static org.junit.Assert.*;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

import com.java.employ.App;
import com.java.employ.Vendor;

public class VendorTest {

	@Test
	public void testConstructor() throws ParseException {
		Vendor vendor = new Vendor();
		assertNotNull(vendor);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date vsd = sdf.parse("2023-10-10");
		Vendor vendornew = new Vendor(1,"chaiwala","benglore","vendor@mail.com",
				"7735509631","open",vsd,4.5,"good");
		
		assertEquals(1, vendornew.getVendorId());
		assertEquals("chaiwala", vendornew.getVendorName());
		assertEquals("benglore",vendornew.getVendorCity());
		assertEquals("vendor@mail.com",vendornew.getVendorEmail());
		assertEquals("7735509631",vendornew.getVendorMobile());
		assertEquals("open",vendornew.getVendorStatus());
		assertEquals(vsd,vendornew.getVendorStartedDate());
		assertEquals(4.5,vendornew.getVendorRating(),0);
		assertEquals("good",vendornew.getVendorReview());
		
	}
	@Test
	public void testGettersAndSetters() throws ParseException {
		
		Vendor vendornew = new Vendor();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date vsd = sdf.parse("2023-10-10");

		vendornew.setVendorId(1);
		vendornew.setVendorName("chaiwala");
		vendornew.setVendorCity("benglore");
		vendornew.setVendorEmail("vendor@mail.com");
		vendornew.setVendorMobile("7735509631");
		vendornew.setVendorStatus("open");
		vendornew.setVendorStartedDate(vsd);
		vendornew.setVendorRating(4.5);
		vendornew.setVendorReview("good");
		
		
		assertEquals(1, vendornew.getVendorId());
		assertEquals("chaiwala", vendornew.getVendorName());
		assertEquals("benglore",vendornew.getVendorCity());
		assertEquals("vendor@mail.com",vendornew.getVendorEmail());
		assertEquals("7735509631",vendornew.getVendorMobile());
		assertEquals("open",vendornew.getVendorStatus());
		assertEquals(vsd,vendornew.getVendorStartedDate());
		assertEquals(4.5,vendornew.getVendorRating(),0);
		assertEquals("good",vendornew.getVendorReview());
	}
	@Test
	public void testToString() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date vsd = sdf.parse("2023-10-10");
		Vendor vendornew = new Vendor(1,"chaiwala","benglore","vendor@mail.com",
				"7735509631","open",vsd,4.5,"good");	
		String result = "Vendor [vendorId=1, vendorName=chaiwala, vendorCity=benglore, vendorEmail=vendor@mail.com, vendorMobile=7735509631, vendorStatus=open, vendorStartedDate=Tue Oct 10 00:00:00 IST 2023, vendorRating=4.5, vendorReview=good]";
		assertEquals(result, vendornew.toString());
	}
	@Test	
	public void testHashCode() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date vsd = sdf.parse("2023-10-10");
        Vendor vendor1 = new Vendor(1,"chaiwala","benglore","vendor@mail.com",
				"7735509631","open",vsd,4.5,"good");
        Vendor vendor2 = new Vendor(1,"chaiwala","benglore","vendor@mail.com",
				"7735509631","open",vsd,4.5,"good");

        assertEquals(vendor1.hashCode(), vendor2.hashCode());

        
        
    }

    @Test
    public void testEquals() throws ParseException {
    		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date vsd = sdf.parse("2023-10-10");
        Vendor vendor1 = new Vendor(1,"chaiwala","benglore","vendor@mail.com",
				"7735509631","open",vsd,4.5,"good");
        Vendor vendor2 = new Vendor(1,"chaiwala","benglore","vendor@mail.com",
				"7735509631","open",vsd,4.5,"good");
        Vendor vendor3 = new Vendor(3,"chaiwala","benglore","vendor@mail.com",
				"7735509631","open",vsd,4.5,"good");
        Vendor vendor =null;
        
        assertFalse(vendor1.equals(vendor));
        assertTrue(vendor1.equals(vendor2));
        assertFalse(vendor1.equals(vendor3));
        
   	 	assertNull(vendor);
        assertNotNull(vendor1);
        
    }
    

}