/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.strings;

/**
 *
 * @author renukajoshi,amoghantarkar
 */

//
//
//Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string "".
//
//Example 1:
//
//Input: ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//
//Input: ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
//Note:
//
//All given inputs are in lowercase letters a-z.
//

class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        for(int i = 0 ; i< strs[0].length(); i++){
            int c = strs[0].charAt(i);
            for(int j = 1 ; j < strs.length;j++){
                if(strs[j].length() == i || c != strs[j].charAt(i) ){
                    return strs[j].substring(0,i);
                }                                        
            }
        }
        return strs[0];
    }
}