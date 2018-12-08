/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfolder;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tickettoride.Game;


/**
 *
 * @author Ryanfinazzo
 */
public class testGame {
    private Game a;
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {  
        a = new Game();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testMoveValid(){
        
     
    }
    
    @Test
    public void testMoveinValid(){
       
        
    }
   
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
