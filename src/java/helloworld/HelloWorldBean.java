/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author Juergen
 */
public class HelloWorldBean {

    private String capital;
    //HTML-Formater
    private String htmlCapital;
    //Bean

    public HelloWorldBean() {
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getHtmlCapital() {
        return htmlCapital;
    }

    public void setHtmlCapital(String htmlCapital) {
        this.htmlCapital = htmlCapital;
    }

    //Other 
    public HelloWorldBean(String capital) {
        this.capital = capital;
    }

}
