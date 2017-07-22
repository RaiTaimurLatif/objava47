/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class10;

/**
 *
 * @author shahzad
 */
public class TestInner {
    public class InnerClass implements InnerInterface {
    }
    
    public interface InnerInterface { 
        
    }
    public static class StaticInnerClass implements InnerInterface { 
        
    }
    
    public static void main ( String[] args ) {
        TestInner t = new TestInner() ;
        InnerClass ic1 = t.new InnerClass() ;
        InnerClass ic2 = new TestInner().new InnerClass() ;
        StaticInnerClass sic1 = new StaticInnerClass() ;
        StaticInnerClass sic2 = new TestInner.StaticInnerClass() ;
    }
}
