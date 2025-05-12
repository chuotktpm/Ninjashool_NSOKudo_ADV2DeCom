

public final class Class_fl extends Auto {
    private boolean d;
    private String e;
    public static boolean a;
    public static boolean b;
    public static boolean c;
 
    public Class_fl(int var1, int var2, String var3) {
       super.a();
       this.d = false;
       super.h = var1;
       super.i = var2;
       this.e = var3;
    }
 
    public final void c() {
       if (Char.getMyChar().cHP <= 0) {
          Auto.a(true);
       } else {
          if (super.h == TileMap.mapID && super.i == TileMap.zoneID) {
             if (!this.d) {
                Class_ae.a = false;
                if (Class_fp.a.equals("")) {
                   GameScr.chatPopup("H\u00e3y Th\u00eam Item C\u1ea7n Giao D\u1ecbch!");
                   Code.c();
                   return;
                }
 
                while(e() > 0) {
                   Class_fj.a(this.e);
                   if (e() <= 0) {
                      if (f() <= 0) {
                         break;
                      }
 
                      for(int var7 = 0; var7 < Code.c(Class_fp.a, ",").length; ++var7) {
                         for(int var8 = 0; var8 < Char.getMyChar().arrItemBox.length; ++var8) {
                            Item var9 = Char.getMyChar().arrItemBox[var8];
                            if (var9 != null && var9.template.id == Integer.parseInt(Code.c(Class_fp.a, ",")[var7]) && !var9.isLock) {
                               Service.getInstance().d(var9.indexUI);
                            }
                         }
                      }
                   }
 
                   if (c) {
                      break;
                   }
 
                   if (a) {
                      GameScr.chatPopup("H\u00e0nh trang \u0111\u1ed1i ph\u01b0\u01a1ng kh\u00f4ng c\u00f2n \u0111\u1ee7 ch\u1ed7 tr\u1ed1ng!");
                      break;
                   }
 
                   GameScr.chatPopup("V\u1eabn c\u00f2n vp s\u1ebd gd l\u1ea1i sau 30s");
                   Auto.sleep(32000L);
                }
 
                if (!a) {
                   GameScr.chatPopup("\u0110\u00e3 h\u1ebft vp c\u1ea7n gd trong h\u00e0nh trang, Ho\u1eb7c \u0111\u1ed1i ph\u01b0\u01a1ng k c\u00f3 trong khu v\u1ef1c n\u00e0y ! !");
                }
 
                this.d = true;
             } else if (Class_fa.b().get(12) != Class_fj.c) {
                Code.c();
             }
          } else {
             this.a(super.h, super.i, -1, -1);
          }
 
       }
    }
 
    public final String toString() {
       return "Auto Send";
    }
 
    public static int e() {
       Item[] var5 = Char.getMyChar().arrItemBag;
       int var7 = 0;
 
       for(int var8 = 0; var8 < Code.c(Class_fp.a, ",").length; ++var8) {
          for(int var9 = 0; var9 < var5.length; ++var9) {
             Item var6;
             if ((var6 = var5[var9]) != null && var6.template.id == Integer.parseInt(Code.c(Class_fp.a, ",")[var8]) && !var6.isLock) {
                ++var7;
             }
          }
       }
 
       return var7;
    }
 
    public static int f() {
       Item[] var5 = Char.getMyChar().arrItemBox;
       int var7 = 0;
 
       for(int var8 = 0; var8 < Code.c(Class_fp.a, ",").length; ++var8) {
          for(int var9 = 0; var9 < var5.length; ++var9) {
             Item var6;
             if ((var6 = var5[var9]) != null && var6.template.id == Integer.parseInt(Code.c(Class_fp.a, ",")[var8]) && !var6.isLock) {
                ++var7;
             }
          }
       }
 
       return var7;
    }
 }
 