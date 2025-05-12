
// Source code is decompiled from a .class file using FernFlower decompiler.
public final class Class_ai extends Auto {
    public Class_ai() {
       super.a();
    }
 
    protected final void c() {
       Char var1;
       if ((var1 = Char.getMyChar()).cHP <= 0) {
          Auto.a(true);
       } else if (var1.ctaskId == 20 && var1.taskMaint.a < var1.taskMaint.e.length - 1) {
          if (TileMap.mapID == 74) {
             this.c(69, -1);
             this.c(221);
             if (Char.getMyChar().cMP < Char.getMyChar().cMaxMP / 2) {
                Char.getMyChar().e(17);
             }
 
             if (Char.getMyChar().cHP < Char.getMyChar().cMaxHP * 3 / 4) {
                int var4 = (int)(System.currentTimeMillis() / 1000L);
 
                for(int var2 = 0; var2 < Char.getMyChar().by.size(); ++var2) {
                   Class_cq var3;
                   if ((var3 = (Class_cq)Char.getMyChar().by.elementAt(var2)).e.a == 21 && var3.c - (var4 - var3.b) >= 2) {
                      return;
                   }
                }
 
                Char.getMyChar().e(16);
                return;
             }
          } else {
             this.a(74, -2, -1, -1);
          }
 
       } else {
          Code var10000 = Code.a;
          Code.f();
       }
    }
 
    public final String toString() {
       return "Đánh Heo";
    }
 }
 