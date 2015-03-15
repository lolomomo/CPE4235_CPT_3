/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpe4235.almz.main;

import com.cpe4235.almz.service.SearchService;
import com.cpe4235.almz.serviceimp.SearchByAddress;

/**
 *
 * @author GunDesstiiniizz
 */
public class TestSearching {

    public static void main(String[] args) {
        SearchService searchService = new SearchByAddress();
        System.out.println(searchService.search("Rainy"));
    }
}
