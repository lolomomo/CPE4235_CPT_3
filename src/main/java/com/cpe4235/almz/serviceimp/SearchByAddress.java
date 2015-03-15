/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpe4235.almz.serviceimp;

import com.cpe4235.almz.service.SearchService;

/**
 *
 * @author GunDesstiiniizz
 */
public class SearchByAddress implements SearchService {

    @Override
    public String search(String text) {
        return "Search By Address : " + text;
    }

}
