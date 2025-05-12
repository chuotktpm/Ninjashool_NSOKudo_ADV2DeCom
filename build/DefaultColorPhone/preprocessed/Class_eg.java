
// Source code is decompiled from a .class file using FernFlower decompiler.
public final class Class_eg {
    public int a;
    public int b;
    public int c = 0;
    public byte d = 0;
    public int e;
    public static Mob f;
 
    public final boolean a() {
       if (this.a < GameScr.i) {
          return false;
       } else if (this.a > GameScr.i + GameScr.b) {
          return false;
       } else if (this.b < GameScr.j) {
          return false;
       } else if (this.b > GameScr.j + GameScr.c + 30) {
          return false;
       } else {
          return f == null || f.h != 8;
       }
    }
 
    public Class_eg(int var1, int var2) {
       this.a = var1;
       this.b = var2;
    }
 }
 