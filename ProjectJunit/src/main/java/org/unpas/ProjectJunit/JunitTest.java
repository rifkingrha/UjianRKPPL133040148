package org.unpas.ProjectJunit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class JunitTest{
	Orang orang;
	
	@Before
	public void sebelumPengetesan(){
		orang = new Orang();
		System.out.println("Sebelum Pengetesan");
	}
	
	@Test
	public void pengujian1(){
		orang.setNama("Rifki");
		assertSame("Seharusnya sama dan pengujian berhasil","Rifki", orang.getNama());
	}
	
	@Test
	public void pengujian2(){
		orang.setUmur(20);
		assertEquals("Seharusnya senilai dan pengujian berhasil", 20, orang.getUmur());
	}
	
	@Test
	public void pengujian3(){
		orang.setJenisKelamin(null);
		assertNotNull("Seharusnya null dan pengujian gagal", orang.getJenisKelamin());
	}
	
	@After
	public void setelahPengetesan(){
		System.out.println("Setelah Pengetesan");
	}
}
