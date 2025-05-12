
// Source code is decompiled from a .class file using FernFlower decompiler.
public final class Class_ag extends Auto {
    private TaskOrder d;
    public int a;
    public static boolean b;
    public static long c;
 
    public Class_ag() {
    }
 
    public final void a() {
       super.a();
       this.d = Char.l(1);
       if (this.d != null) {
          this.a = this.d.killId;
          super.h = this.d.mapId;
          if (TileMap.mapID == this.d.mapId && TileMap.zoneID % 5 == 0) {
             super.i = TileMap.zoneID;
             return;
          }
       }
 
       super.i = 5;
       b = false;
    }
 
    public final void a(int var1, int var2) {
       super.a();
       this.d = null;
       this.a = var2;
       super.h = var1;
       if (TileMap.mapID == var1 && TileMap.zoneID % 5 == 0) {
          super.i = TileMap.zoneID;
       } else {
          super.i = 5;
       }
    }
 
    public final void b() {
       this.d = Char.l(1);
       super.b();
    }
 
    public final void c() {
       Code var10000;
       if (super.h >= 0 && (!(super.instance instanceof Stanima) || System.currentTimeMillis() - super.o < 3600000L)) {
          int var1;
          boolean var5;
          if (super.i()) {
             if (Char.em && TileMap.mapID == super.h && TileMap.zoneID == super.i && Char.getMyChar().mobFocus != null && Char.getMyChar().mobFocus.c < Char.getMyChar().mobFocus.d / 20) {
                var1 = 0;
 
                while(true) {
                   if (var1 >= GameScr.vParty.size()) {
                      var5 = false;
                      break;
                   }
 
                   Party var2;
                   if ((var2 = (Party)GameScr.vParty.elementAt(var1)).f != null && var2.f.cHP > 0) {
                      var5 = true;
                      break;
                   }
 
                   ++var1;
                }
             } else {
                var5 = false;
             }
 
             if (!var5) {
                Auto.a(true);
                return;
             }
          } else if (TileMap.mapID == super.h && TileMap.zoneID == super.i) {
             if (this.d != null && this.d.count >= this.d.maxCount) {
                GameScr.chatPopup("Xong Tà Thú");
                var10000 = Code.a;
                Code.c();
                return;
             }
 
             if (Char.getMyChar().charName.equals(Code.g)) {
                if (Char.getMyChar().mobFocus != null && Char.getMyChar().mobFocus.c < Char.getMyChar().mobFocus.d / 10) {
                   if (!LockGame.ad()) {
                      Service.getInstance().k("waitGr");
                      LockGame.b(200000L);
                      Service.getInstance().k("notifyGr");
                   }
 
                   var5 = false;
                } else {
                   var5 = false;
                }
             } else {
                if (b && System.currentTimeMillis() - c > 120000L) {
                   b = false;
                }
 
                var5 = b;
             }
 
             if (!var5) {
                this.c(this.a, 8);
             }
 
             if (Char.getMyChar().cMP < Char.getMyChar().cMaxMP * Char.et / 100) {
                Char.getMyChar().e(17);
             }
 
             if (Char.getMyChar().cHP < Char.getMyChar().cMaxHP * Char.es / 100) {
                var1 = (int)(System.currentTimeMillis() / 1000L);
 
                for(int var4 = 0; var4 < Char.getMyChar().by.size(); ++var4) {
                   Class_cq var3;
                   if ((var3 = (Class_cq)Char.getMyChar().by.elementAt(var4)).e.a == 21 && var3.c - (var1 - var3.b) >= 2) {
                      return;
                   }
                }
 
                Char.getMyChar().e(16);
                return;
             }
          } else {
             this.a(super.h, super.i, super.k, super.l);
          }
 
       } else {
          var10000 = Code.a;
          Code.c();
       }
    }
 
    public final String toString() {
       return "Auto Tà Thú";
    }
 }
 