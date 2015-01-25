/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cpe4235.selfmylost.serviceimp;

import com.cpe4235.selfmylost.service.SearchService;

/**
 *
 * @author RainWhileLoop
 */
public class SearchByName implements SearchService {

    @Override
    public String search(String text) {
        return "Search By Name : " + text;
    }

}
