/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

/**
 *
 * @author Lenovo
 */
public class PersegiPanjang {
    protected float panjang;
    protected float lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
 
    public float HitungKeliling() {
        float keliling = (panjang+lebar) * 2;
        return keliling;
    }

    public float HitungLuas() {
        float luas = panjang * lebar;
        return luas;
    }
}
