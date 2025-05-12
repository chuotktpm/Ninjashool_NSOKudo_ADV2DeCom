
// Source code is decompiled from a .class file using FernFlower decompiler.
public final class TuDanh extends Auto {
    public TuDanh() {
    }
 
    public final void a() {
       super.a();
       super.h = TileMap.mapID;
       super.i = TileMap.zoneID;
       super.k = Char.getMyChar().cx;
       super.l = Char.getMyChar().cy;
    }
 
    public final void c() {
       if (super.i()) {
          if (Char.tickReMap) {
             Auto.a(true);
             return;
          }
       } else {
          if (!Auto.q && Char.getMyChar().isHuman) {
             this.l();
             return;
          }
 
          if (super.h == TileMap.mapID && (super.j || super.i == TileMap.zoneID)) {
             this.c(-1);
             this.c(-1, -1);
             return;
          }
 
          if (Char.tickReMap) {
             this.a(super.h, super.i, super.k, super.l);
          }
       }
 
    }
 
    protected final Mob a(Char var1, int var2, int var3, Char var4, boolean var5) {
       if (Code.q && Code.s.size() > 0) {
          this.a(var3, var5);
          return Auto.b(var1.cx, var1.cy);
       } else {
          return Auto.b(var1.cx, var1.cy);
       }
    }
 
    public final String toString() {
       return "Tự đánh";
    }
 }
 