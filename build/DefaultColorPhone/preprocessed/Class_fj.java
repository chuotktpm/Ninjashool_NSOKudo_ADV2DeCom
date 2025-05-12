import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Calendar;

public final class Class_fj extends Auto {
   public static String a;
   public static byte b;
   public static byte c;
   public static int d;
   public static byte e;
   public static boolean f;
   public static boolean ab;

   public Class_fj() {
      super.a();
      super.h = TileMap.mapID;
      super.i = TileMap.zoneID;
   }

   public static boolean e() {
      Calendar var0;
      return a != null && (var0 = Class_fa.b()).get(11) == b && var0.get(12) == c;
   }

   private static void o() {
      try {
         ByteArrayInputStream var7 = new ByteArrayInputStream(RMS.getRecord("V6Rec"));
         DataInputStream var8;
         if ((a = (var8 = new DataInputStream(var7)).readUTF()).equals("")) {
            a = null;
         }

         if ((Class_fp.a = var8.readUTF()).equals("")) {
            Class_fp.a = null;
         }

         if ((Class_fp.b = var8.readUTF()).equals("")) {
            Class_fp.b = null;
         }

         b = var8.readByte();
         c = var8.readByte();
         d = var8.readInt();
         e = var8.readByte();
         var8.close();
         var7.close();
      } catch (Exception var9) {
         var9.printStackTrace();
      }

   }

   public static void f() {
      try {
         ByteArrayInputStream var9 = new ByteArrayInputStream(RMS.getRecord("V6Rec"));
         DataInputStream var10;
         if ((a = (var10 = new DataInputStream(var9)).readUTF()).equals("")) {
            a = null;
         }

         if ((Class_fp.a = var10.readUTF()).equals("")) {
            Class_fp.a = null;
         }

         if ((Class_fp.b = var10.readUTF()).equals("")) {
            Class_fp.b = null;
         }

         b = var10.readByte();
         c = var10.readByte();
         d = var10.readInt();
         e = var10.readByte();
         var10.close();
         var9.close();
      } catch (Exception var11) {
         var11.printStackTrace();
      }

   }

   public static void n() {
      ByteArrayOutputStream var9 = new ByteArrayOutputStream();
      DataOutputStream var10 = new DataOutputStream(var9);

      try {
         var10.writeUTF(a == null ? "" : a);
         var10.writeUTF(Class_fp.a == null ? "" : Class_fp.a);
         var10.writeUTF(Class_fp.b == null ? "" : Class_fp.b);
         var10.writeByte(b);
         var10.writeByte(c);
         var10.writeInt(d);
         var10.writeByte(e);
         var10.flush();
         var9.flush();
         RMS.writeRecord("V6Rec", var9.toByteArray());
      } catch (Exception var11) {
         var11.printStackTrace();
      }

   }

   public final void c() {
      if (Char.getMyChar().cHP <= 0) {
         Auto.a(true);
      } else if (super.h == TileMap.mapID && super.i == TileMap.zoneID) {
         LockGame.a(-1L);
         Class_ae.a = false;
         long var1 = System.currentTimeMillis();

         while(GameScr.getInstance().da != 1) {
            if (Class_ae.a || System.currentTimeMillis() - var1 >= 20000L) {
               return;
            }

            Auto.sleep(200L);
         }

         GameScr.getInstance().db = 0;
         GameScr.arrItemTradeMe = new Item[12];
         Service.getInstance().a(0, GameScr.arrItemTradeMe);
         GameScr.getInstance().cz = 1;
         Auto.sleep(5000L);
         Service.getInstance().j();
         LockGame.a(20000L);
      } else {
         this.a(super.h, super.i, -1, -1);
      }
   }

   public final String toString() {
      return "Auto Receiver";
   }

   static {
      f();
   }

   public static void a(String var0) {
      Char var1 = Char.getMyChar();
      int var2 = 0;

      Char var10000;
      while(true) {
         if (var2 >= GameScr.vCharInMap.size()) {
            var10000 = null;
            break;
         }

         Char var3;
         if ((var3 = (Char)GameScr.vCharInMap.elementAt(var2)).charName.equals(var0)) {
            var10000 = var3;
            break;
         }

         ++var2;
      }

      Char var8 = var10000;
      if (var10000 == null) {
         Class_fl.c = true;
      } else {
         do {
            if (Class_fa.a(var1.cx, var1.cy, var8.cx, var8.cy) >= 50) {
                try {
                    Char.c(var8.cx, var8.cy);
                    Thread.sleep(1000L);
                } catch (InterruptedException ex) {
                    
                }
            } else {
               Service.getInstance().tradeInvite(var8.charID);
            }
         } while(!GameScr.ci && !LockGame.a(1000L));

         Item[] var9 = new Item[12];
         var2 = 0;

         for(int var7 = 0; var7 < Code.c(Class_fp.a, ",").length; ++var7) {
            for(int var4 = 0; var4 < var1.arrItemBag.length; ++var4) {
               Item var5 = var1.arrItemBag[var4];
               if (var2 < 12 && var5 != null && var5.template.id == Integer.parseInt(Code.c(Class_fp.a, ",")[var7]) && !var5.isLock) {
                  var9[var2++] = var5;
               }
            }
         }

         GameScr.getInstance().db = 0;
         GameScr.arrItemTradeMe = var9;
         Service.getInstance().a(Char.getMyChar().xu, var9);
         GameScr.getInstance().cz = 1;
         long var11 = System.currentTimeMillis();

         while(GameScr.getInstance().da != 1) {
             try {
                 if (Class_ae.a || System.currentTimeMillis() - var11 >= 20000L) {
                     return;
                 }
                 
                 Thread.sleep(200L);
             } catch (InterruptedException ex) {
                 
             }
         }

         var11 = System.currentTimeMillis();

         while(System.currentTimeMillis() - var11 < 5000L) {
             try {
                 if (Class_ae.a) {
                     return;
                 }
                 
                 Thread.sleep(200L);
             } catch (InterruptedException ex) {
                 
             }
         }

         Service.getInstance().j();
         if (LockGame.a(20000L)) {
            for(int var10 = 0; var10 < 12; ++var10) {
               if (var9[var10] != null) {
                  int var10001 = var9[var10].indexUI;
                  Char.getMyChar().arrItemBag[var10001] = null;
               }
            }
         }

      }
   }
}
