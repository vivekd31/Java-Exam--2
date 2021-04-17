/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seventhquestion;

/**
 *
 * @author Vivek Drakshapally
 */
public enum TropicanaSize {
    SMALL(10), MEDIUM(20);
    private int litres;

    private TropicanaSize(int litres) {
        this.litres = litres;
    }

    public int getLitres() {
        return litres;
    }

}
