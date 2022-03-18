/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jeux_421.bean;

import java.util.Comparator;

/**
 *
 * @author PC MAROC
 */
public class Comparateur_Cobinaison implements Comparator<NomCombinaison>{

    @Override
    public int compare(NomCombinaison o1, NomCombinaison o2) {
        if (o1 == o2) {
			return 0;
		}

		if (o1 == o1.QuatreCentVingtUn) {
			return 1;	
		}

		if (o2 == o2.QuatreCentVingtUn) {
			return -1;
		}

		if (o1 == o1.SIXAS) {
			return 1;	
		}

		if (o2 == o2.SIXAS) {
			return -1;
		}

		if (o1 == o1.SIXFICHE || o1 == o1.BROLANSIX) {
			return 1;	
		}

		if (o2 == o2.SIXFICHE || o2 == o2.BROLANSIX) {
			return -1;	
		}

		if (o1 == o1.FIVEFICHE || o1 == o1.BROLANFIVE) {
			return 1;	
		}

		if (o2 == o2.FIVEFICHE || o2 == o2.BROLANFIVE) {
			return -1;	
		}

		if (o1 == o1.FOURFICHE || o1 == o1.BROLANFOUR) {
			return 1;	
		}

		if (o2 == o2.FOURFICHE || o2 == o2.BROLANFOUR) {
			return -1;	
		}

		if (o1 == o1.THREEFICHE|| o1 == o1.BROLANTHREE) {
			return 1;	
		}

		if (o2 == o2.THREEFICHE || o2 == o2.BROLANTHREE) {
			return -1;	
		}

		if (o1 == o1.TWOEFICHE || o1 == o1.BROLANTWO || o1 == o1.SUITE ||  o1 == o1.nenette ) {
			return 1;	
		}

		if (o2 == o2.TWOEFICHE || o2 == o2.BROLANTWO || o2 == o2.SUITE ||  o2 == o2.nenette) {
			return -1;	
		}

		return 0; 
    }
    
}
