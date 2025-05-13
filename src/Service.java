import java.io.IOException;
import javax.microedition.lcdui.Display;

public final class Service {
   public ag aaa = cs.aba();
   private static Service aba;
   private int aca;
   private int ada;

   public static Service aaa() {
      if (aba == null) {
         aba = new Service();
      }

      return aba;
   }

   static fe aaa(byte var0) {
      fe var1;
      (var1 = new fe((byte)-29)).aca.writeByte(var0);
      return var1;
   }

   public static fe aba(byte var0) {
      fe var1;
      (var1 = new fe((byte)-28)).aca.writeByte(var0);
      return var1;
   }

   static fe aca(byte var0) {
      fe var1;
      (var1 = new fe((byte)-30)).aca.writeByte(var0);
      return var1;
   }

   public final void aba() {
      try {
         fe var1;
         (var1 = aaa((byte)-125)).aca.writeByte(Class_ab.aea);
         var1.aca.writeByte(as.aba);
         var1.aca.writeBoolean(GameCanvas.aca);
         var1.aca.writeInt(GameCanvas.aza);
         var1.aca.writeInt(GameCanvas.baa);
         var1.aca.writeBoolean(eq.asa);
         var1.aca.writeBoolean(GameCanvas.afa);
         var1.aca.writeUTF(System.getProperty("microedition.platform"));
         var1.aca.writeByte(0);
         var1.aca.writeInt(0);
         var1.aca.writeByte(er.aea);
         var1.aca.writeInt(Class_ab.aha);
         var1.aca.writeUTF(Class_ab.aia);
         this.aaa.aaa(var1);
         var1.aca();
      } catch (IOException var2) {
         var2.printStackTrace();
      }
   }

   public final void aaa(String var1, String var2, String var3) {
      this.aba();

      try {
         fe var4;
         (var4 = aaa((byte)-127)).aca.writeUTF(var1);
         var4.aca.writeUTF(var2);
         var4.aca.writeUTF(var3);
         var4.aca.writeUTF("");
         var4.aca.writeUTF("");
         var4.aca.writeUTF(fd.aca("random"));
         var4.aca.writeByte(Class_ab.aka);
         this.aaa.aaa(var4);
         var4.aca();
      } catch (IOException var5) {
         var5.printStackTrace();
      }
   }

   private void aba(String var1, String var2, String var3) {
      try {
         fe var4;
         (var4 = new fe((byte)118)).aca.writeUTF(var1);
         var4.aca.writeUTF(var2);
         var4.aca.writeUTF(var3);
         this.aaa.aaa(var4);
         var4.aca();
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   public final void aaa(String var1) {
      try {
         fe var2;
         (var2 = aaa((byte)-122)).aca.writeUTF(var1);
         this.aaa.aaa(var2);
         var2.aca();
      } catch (IOException var3) {
         var3.printStackTrace();
      }
   }

   public final void aca() {
      fe var1 = new fe((byte)-17);
      this.aaa.aaa(var1);
      var1.aca();
   }

   public final void aaa(int var1, int var2) {
      fe var3 = new fe((byte)28);

      try {
         var3.aca.writeByte(var1);
         var3.aca.writeByte(var2);
         this.aaa.aaa(var3);
         var3.aca();
      } catch (Exception var4) {
      }
   }

   public final void aba(int var1, int var2) {
      try {
         if (var1 - this.aca != 0 || var2 - this.ada != 0) {
            fe var3;
            (var3 = new fe((byte)1)).aca.writeShort(var1);
            var3.aca.writeShort(var2);
            this.aca = var1;
            this.ada = var2;
            this.aaa.aaa(var3);
            var3.aca();
            return;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

   }

   public final void aba(String var1) {
      fe var2 = new fe((byte)-28);

      try {
         var2.aca.writeByte(-126);
         var2.aca.writeUTF(var1);
      } catch (Exception var3) {
         var3.printStackTrace();
      }

      this.aaa.aaa(var2);
   }

   private void aaa(String var1, int var2, int var3) {
      fe var4 = new fe((byte)-28);

      try {
         var4.aca.writeByte(-125);
         var4.aca.writeUTF(var1);
         var4.aca.writeByte(var2);
         var4.aca.writeByte(var3);
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      this.aaa.aaa(var4);
   }

   private void bna(int var1) {
      fe var2 = null;

      try {
         (var2 = aba((byte)-108)).aca.writeByte(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void aca(int var1, int var2) {
      fe var3 = null;

      try {
         (var3 = new fe((byte)42)).aca.writeByte(var1);
         var3.aca.writeByte(var2);
         this.aaa.aaa(var3);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var3.aca();
      }

   }

   public final void ada(int var1, int var2) {
      fe var3 = null;

      try {
         (var3 = new fe((byte)94)).aca.writeInt(var1);
         var3.aca.writeByte(var2);
         this.aaa.aaa(var3);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var3.aca();
      }

   }

   public final void aea(int var1, int var2) {
      fe var3 = null;

      try {
         (var3 = aca((byte)-109)).aca.writeByte(var1);
         var3.aca.writeShort(var2);
         this.aaa.aaa(var3);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var3.aca();
      }

   }

   public final void afa(int var1, int var2) {
      fe var3 = null;

      try {
         (var3 = aca((byte)-108)).aca.writeShort(var1);
         var3.aca.writeByte(var2);
         this.aaa.aaa(var3);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var3.aca();
      }

   }

   public final void aaa(int var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)15)).aca.writeByte(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void aba(int var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)108)).aca.writeByte(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void aca(int var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)16)).aca.writeByte(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void ada(int var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)17)).aca.writeByte(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void aea(int var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)11)).aca.writeByte(var1);
         this.aaa.aaa(var2);
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

      if (Char.getMyChar().arrItemBag[var1] != null && Char.getMyChar().arrItemBag[var1].aaa.aba == 24) {
         GameScr.ava().bca();
         br.aaa("");
      }

   }

   public final void aga(int var1, int var2) {
      GameCanvas.bja.aba();
      fe var3 = null;

      try {
         (var3 = new fe((byte)14)).aca.writeByte(var1);
         if (var2 > 1) {
            var3.aca.writeInt(var2);
         }

         this.aaa.aaa(var3);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var3.aca();
      }

   }

   public final void aha(int var1, int var2) {
      fe var3 = null;

      try {
         (var3 = new fe((byte)14)).aca.writeByte(var1);
         if (var2 > 1) {
            var3.aca.writeInt(var2);
         }

         this.aaa.aaa(var3);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var3.aca();
      }

   }

   public final void aaa(int var1, int var2, int var3) {
      GameCanvas.bja.aba();
      fe var4 = null;

      try {
         (var4 = new fe((byte)13)).aca.writeByte(var1);
         var4.aca.writeByte(var2);
         if (var3 > 1) {
            var4.aca.writeShort(var3);
         }

         this.aaa.aaa(var4);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var4.aca();
      }

   }

   public final void aba(int var1, int var2, int var3) {
      fe var4 = null;

      try {
         (var4 = new fe((byte)13)).aca.writeByte(var1);
         var4.aca.writeByte(var2);
         if (var3 > 1) {
            var4.aca.writeShort(var3);
         }

         this.aaa.aaa(var4);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var4.aca();
      }

   }

   public final void afa(int var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)41)).aca.writeShort(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void ada() {
      fe var1 = null;

      try {
         var1 = aca((byte)-77);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   public final void aea() {
      fe var1 = null;

      try {
         var1 = new fe((byte)36);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   public final void aia(int var1, int var2) {
      fe var3 = null;

      try {
         (var3 = new fe((byte)12)).aca.writeByte(var1);
         var3.aca.writeByte(var2);
         this.aaa.aaa(var3);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var3.aca();
      }

   }

   public final void aga(int var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)40)).aca.writeShort(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void aca(int var1, int var2, int var3) {
      fe var4 = null;

      try {
         (var4 = new fe((byte)29)).aca.writeByte(var1);
         var4.aca.writeByte(var2);
         var4.aca.writeByte(var3);
         this.aaa.aaa(var4);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var4.aca();
      }

   }

   private void aba(short var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)34)).aca.writeShort(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void aaa(short var1, String var2) {
      fe var3 = null;

      try {
         (var3 = new fe((byte)92)).aca.writeShort(var1);
         var3.aca.writeUTF(var2);
         this.aaa.aaa(var3);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var3.aca();
      }

   }

   public final void aha(int var1) {
      fe var2 = null;

      try {
         (var2 = aca((byte)-103)).aca.writeByte(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void afa() {
      fe var1 = null;

      try {
         var1 = aca((byte)-107);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   public final void aga() {
      fe var1 = null;

      try {
         var1 = aca((byte)-106);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   public final void aia(int var1) {
      fe var2 = null;

      try {
         (var2 = aca((byte)-105)).aca.writeInt(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void aja(int var1) {
      fe var2 = null;

      try {
         (var2 = aca((byte)-104)).aca.writeInt(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void aaa(gg[] var1) {
      GameCanvas.bja.aba();
      fe var2 = null;

      try {
         var2 = new fe((byte)19);

         for(int var3 = 0; var3 < var1.length; ++var3) {
            if (var1[var3] != null) {
               var2.aca.writeByte(var1[var3].ada);
            }
         }

         this.aaa.aaa(var2);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void aaa(gg var1, gg[] var2, boolean var3) {
      GameCanvas.bja.aba();
      fe var4 = null;

      try {
         (var4 = new fe((byte)21)).aca.writeBoolean(var3);
         var4.aca.writeByte(var1.ada);

         for(int var9 = 0; var9 < var2.length; ++var9) {
            if (var2[var9] != null) {
               var4.aca.writeByte(var2[var9].ada);
            }
         }

         this.aaa.aaa(var4);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var4.aca();
      }

   }

   public final void aaa(gg var1, gg[] var2) {
      fe var3 = null;

      try {
         (var3 = new fe((byte)21)).aca.writeBoolean(false);
         var3.aca.writeByte(var1.ada);

         for(int var8 = 0; var8 < var2.length; ++var8) {
            if (var2[var8] != null) {
               var3.aca.writeByte(var2[var8].ada);
            }
         }

         this.aaa.aaa(var3);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var3.aca();
      }

   }

   public final void aba(gg[] var1) {
      GameCanvas.bja.aba();
      fe var2 = null;

      try {
         var2 = new fe((byte)20);

         for(int var3 = 0; var3 < var1.length; ++var3) {
            if (var1[var3] != null) {
               var2.aca.writeByte(var1[var3].ada);
            }
         }

         this.aaa.aaa(var2);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void aca(gg[] var1) {
      fe var2 = null;

      try {
         var2 = new fe((byte)20);

         for(int var3 = 0; var3 < var1.length; ++var3) {
            if (var1[var3] != null) {
               var2.aca.writeByte(var1[var3].ada);
            }
         }

         this.aaa.aaa(var2);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void aaa(gg var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)22)).aca.writeByte(var1.ada);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void aka(int var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)44)).aca.writeInt(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void ala(int var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)99)).aca.writeInt(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void ama(int var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)106)).aca.writeInt(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void ana(int var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)107)).aca.writeByte(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   private void boa(int var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)66)).aca.writeInt(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void aha() {
      fe var1 = null;

      try {
         var1 = new fe((byte)56);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   public final void aia() {
      fe var1 = null;

      try {
         var1 = new fe((byte)57);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   public final void aja() {
      fe var1 = null;

      try {
         var1 = new fe((byte)46);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   public final void aaa(int var1, gg[] var2) {
      fe var3 = null;

      try {
         (var3 = new fe((byte)45)).aca.writeInt(var1);
         var1 = 0;

         int var4;
         for(var4 = 0; var4 < var2.length; ++var4) {
            if (var2[var4] != null) {
               ++var1;
            }
         }

         var3.aca.writeByte(var1);

         for(var4 = 0; var4 < var2.length; ++var4) {
            if (var2[var4] != null) {
               var3.aca.writeByte(var2[var4].ada);
            }
         }

         this.aaa.aaa(var3);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var3.aca();
      }

   }

   public final void aaa(ev var1, ev var2, int var3) {
      fe var4 = null;
      if (var3 != 0) {
         try {
            ac var5;
            Char var7;
            if (var1.size() > 0 && var2.size() > 0) {
               if (var3 == 1) {
                  var4 = new fe((byte)4);
               } else if (var3 == 2) {
                  var4 = new fe((byte)73);
               }

               var4.aca.writeByte(var1.size());

               for(var3 = 0; var3 < var1.size(); ++var3) {
                  var5 = (ac)var1.elementAt(var3);
                  var4.aca.writeByte(var5.ala);
               }

               for(var3 = 0; var3 < var2.size(); ++var3) {
                  if ((var7 = (Char)var2.elementAt(var3)) != null) {
                     var4.aca.writeInt(var7.asa);
                  } else {
                     var4.aca.writeInt(-1);
                  }
               }
            } else if (var1.size() > 0) {
               var4 = new fe((byte)60);

               for(var3 = 0; var3 < var1.size(); ++var3) {
                  var5 = (ac)var1.elementAt(var3);
                  var4.aca.writeByte(var5.ala);
               }
            } else if (var2.size() > 0) {
               var4 = new fe((byte)61);

               for(var3 = 0; var3 < var2.size(); ++var3) {
                  var7 = (Char)var2.elementAt(var3);
                  var4.aca.writeInt(var7.asa);
               }
            }

            if (var4 != null) {
               this.aaa.aaa(var4);
               return;
            }
         } catch (Exception var6) {
         }
      }

   }

   public final void aoa(int var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)-14)).aca.writeShort(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void apa(int var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)-12)).aca.writeByte(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void aka() {
      fe var1 = null;

      try {
         var1 = new fe((byte)-9);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   public final void ala() {
      fe var1 = null;

      try {
         var1 = new fe((byte)-10);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   public final void aja(int var1, int var2) {
      fe var3 = null;

      try {
         (var3 = new fe((byte)47)).aca.writeByte(var1);
         var3.aca.writeByte(var2);
         this.aaa.aaa(var3);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var3.aca();
      }

   }

   public final void aca(String var1) {
      eg.aaa();
      boolean var10000;
      if (var1.equals("cd")) {
         bv var2 = eg.afa;
         Display.getDisplay(Class_ab.aja).setCurrent(var2.aaa);
         var10000 = true;
      } else if (var1.equals("atc")) {
         cr.aaa = !cr.aaa;
         (new Thread(new cr())).start();
         GameScr.chatPopup("Auto chat: " + (cr.aaa ? "Bật" : "Tắt"));
         var10000 = true;
      } else if (var1.equals("hsl")) {
         if (eg.aaa = !eg.aaa) {
            fd.aaa("hsl", 1);
            GameScr.chatPopup("Hồi sinh lượng: Bật");
         } else {
            fd.aaa("hsl", -1);
            GameScr.chatPopup("Hồi sinh lượng: Tắt");
         }

         var10000 = true;
      } else if (var1.equals("locdo")) {
         if (TanSat.aba = !TanSat.aba) {
            fd.aaa("locdo", 1);
            GameScr.chatPopup("Lọc đồ: Bật");
         } else {
            fd.aaa("locdo", -1);
            GameScr.chatPopup("Lọc đồ: Tắt");
         }

         var10000 = true;
      } else if (var1.equals("dv")) {
         if (eg.aga = !eg.aga) {
            fd.aaa("adv", 1);
            GameScr.chatPopup("Tự đi làm danh vọng: Bật");
         } else {
            fd.aaa("adv", -1);
            GameScr.chatPopup("Tự đi làm danh vọng: Tắt");
         }

         var10000 = true;
      } else if (var1.equals("glv")) {
         if (Code.aya = !Code.aya) {
            fd.aaa("glv", 1);
            GameScr.chatPopup("Tự đi pk âm: Bật");
         } else {
            fd.aaa("glv", -1);
            GameScr.chatPopup("Tự đi pk âm: Tắt");
         }

         var10000 = true;
      } else if (var1.equals("pk")) {
         Code.boa = !Code.boa;
         GameScr.chatPopup("Auto pk: " + (Code.boa ? "Bật" : "Tắt"));
         var10000 = true;
      } else {
         var10000 = false;
      }

      if (!var10000) {
         fe var7 = null;

         try {
            (var7 = new fe((byte)-23)).aca.writeUTF(var1);
            this.aaa.aaa(var7);
            return;
         } catch (Exception var5) {
            var5.printStackTrace();
         } finally {
            var7.aca();
         }

      }
   }

   public final void ada(String var1) {
      fe var2 = null;

      try {
         (var2 = aba((byte)-78)).aca.writeUTF(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void ama() {
      fe var1 = null;

      try {
         var1 = aba((byte)-122);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   public final void ana() {
      fe var1 = null;

      try {
         var1 = aba((byte)-121);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   public final void aoa() {
      fe var1 = null;

      try {
         var1 = aba((byte)-120);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   public final void apa() {
      fe var1 = null;

      try {
         var1 = aba((byte)-119);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   public final void aqa() {
      fe var1 = null;

      try {
         var1 = aba((byte)-101);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   public final void aqa(int var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)43)).aca.writeInt(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void aea(String var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)59)).aca.writeUTF(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void ara(int var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)80)).aca.writeInt(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   private void bpa(int var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)81)).aca.writeInt(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void asa(int var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)65)).aca.writeInt(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void ata(int var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)68)).aca.writeInt(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void aua(int var1) {
      fe var2 = null;

      try {
         (var2 = aca((byte)-79)).aca.writeInt(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void afa(String var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)79)).aca.writeUTF(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void ava(int var1) {
      fe var2 = null;

      try {
         (var2 = aba((byte)-109)).aca.writeByte(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void awa(int var1) {
      fe var2 = null;

      try {
         (var2 = aca((byte)-93)).aca.writeByte(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void axa(int var1) {
      fe var2 = null;

      try {
         (var2 = aca((byte)-87)).aca.writeByte(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void aya(int var1) {
      fe var2 = null;

      try {
         (var2 = aca((byte)-86)).aca.writeByte(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void ara() {
      fe var1 = null;

      try {
         (var1 = new fe((byte)74)).aca.writeByte(Char.getMyChar().ara);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   public final void asa() {
      fe var1 = null;

      try {
         var1 = aca((byte)-88);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   public final void aaa(boolean var1) {
      fe var2 = null;

      try {
         (var2 = aca((byte)-76)).aca.writeBoolean(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void ata() {
      fe var1 = null;

      try {
         var1 = new fe((byte)83);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   private void bja() {
      fe var1 = null;

      try {
         var1 = aca((byte)-85);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   public final void aza(int var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)100)).aca.writeByte(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void aaa(ev var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)25)).aca.writeByte(var1.size());

         for(int var3 = 0; var3 < var1.size(); ++var3) {
            Char var4 = (Char)var1.elementAt(var3);
            var2.aca.writeInt(var4.asa);
         }

         this.aaa.aaa(var2);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   private void bka() {
      fe var1 = null;

      try {
         var1 = aca((byte)-84);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   public final void aga(String var1) {
      fe var2 = null;

      try {
         (var2 = aca((byte)-83)).aca.writeUTF(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void aha(String var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)23)).aca.writeUTF(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void aia(String var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)24)).aca.writeUTF(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void aja(String var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)93)).aca.writeUTF(var1);
         var2.aca.writeByte(0);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void aka(String var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)-20)).aca.writeUTF(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   private void ara(String var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)-21)).aca.writeUTF(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void aaa(String var1, String var2) {
      fe var3 = null;

      try {
         (var3 = new fe((byte)-22)).aca.writeUTF(var1);
         var3.aca.writeUTF(var2);
         this.aaa.aaa(var3);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var3.aca();
      }

   }

   private void asa(String var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)-19)).aca.writeUTF(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   private void aba(String var1, String var2) {
      fe var3 = null;

      try {
         (var3 = aba((byte)-99)).aca.writeUTF(var1);
         var3.aca.writeUTF(var2);
         this.aaa.aaa(var3);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var3.aca();
      }

   }

   public final void aaa(String var1, byte[] var2, byte var3) {
      fe var4 = null;

      try {
         (var4 = aca((byte)-67)).aca.writeUTF(var1);
         var4.aca.writeInt(var2.length);
         var4.aca.write(var2);
         var4.aca.writeByte(var3);
         this.aaa.aaa(var4);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var4.aca();
      }

   }

   public final void ala(String var1) {
      fe var2 = null;

      try {
         (var2 = aca((byte)-65)).aca.writeUTF(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void aaa(String var1, int var2) {
      fe var3 = null;

      try {
         (var3 = aba((byte)-97)).aca.writeInt(var2);
         var3.aca.writeUTF(var1);
         this.aaa.aaa(var3);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var3.aca();
      }

   }

   public final void baa(int var1) {
      fe var2 = null;

      try {
         (var2 = aba((byte)-115)).aca.writeInt(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void aua() {
      fe var1 = null;

      try {
         var1 = aba((byte)-113);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   public final void ava() {
      fe var1 = null;

      try {
         var1 = aba((byte)-112);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   public final void awa() {
      fe var1 = null;

      try {
         var1 = aba((byte)-111);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   public final void axa() {
      fe var1 = null;

      try {
         var1 = aba((byte)-114);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   public final void bba(int var1) {
      fe var2 = null;

      try {
         (var2 = aca((byte)-63)).aca.writeInt(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void bca(int var1) {
      fe var2 = null;

      try {
         (var2 = aca((byte)-61)).aca.writeInt(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void bda(int var1) {
      fe var2 = null;

      try {
         (var2 = aca((byte)-62)).aca.writeInt(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void bea(int var1) {
      fe var2 = null;

      try {
         (var2 = aca((byte)-60)).aca.writeInt(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void ama(String var1) {
      fe var2 = null;

      try {
         (var2 = aba((byte)-95)).aca.writeUTF(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void aba(String var1, int var2) {
      fe var3 = null;

      try {
         (var3 = aba((byte)-94)).aca.writeUTF(var1);
         var3.aca.writeByte(var2);
         this.aaa.aaa(var3);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var3.aca();
      }

   }

   public final void ana(String var1) {
      fe var2 = null;

      try {
         (var2 = aba((byte)-93)).aca.writeUTF(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void aya() {
      fe var1 = null;

      try {
         var1 = aba((byte)-92);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   public final void bfa(int var1) {
      fe var2 = null;

      try {
         (var2 = aba((byte)-90)).aca.writeInt(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void bga(int var1) {
      fe var2 = null;

      try {
         (var2 = aba((byte)-89)).aca.writeInt(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void aza() {
      fe var1 = null;

      try {
         var1 = aba((byte)-91);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   public final void ada(int var1, int var2, int var3) {
      fe var4 = null;

      try {
         (var4 = aba((byte)-88)).aca.writeByte(var1);
         var4.aca.writeByte(var2);
         var4.aca.writeByte(var3);
         this.aaa.aaa(var4);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var4.aca();
      }

   }

   public final void aoa(String var1) {
      fe var2 = null;

      try {
         (var2 = aba((byte)-87)).aca.writeUTF(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void apa(String var1) {
      fe var2 = null;

      try {
         (var2 = aba((byte)-70)).aca.writeUTF(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void baa() {
      fe var1 = null;

      try {
         var1 = aba((byte)-68);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   public final void bba() {
      fe var1 = null;

      try {
         var1 = aba((byte)-69);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   public final void bca() {
      fe var1 = null;

      try {
         var1 = aba((byte)-62);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   public final void aka(int var1, int var2) {
      fe var3 = null;

      try {
         (var3 = aba((byte)-85)).aca.writeByte(var1);
         var3.aca.writeInt(var2);
         this.aaa.aaa(var3);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var3.aca();
      }

   }

   public final void bha(int var1) {
      fe var2 = null;

      try {
         (var2 = aba((byte)-105)).aca.writeInt(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void bia(int var1) {
      fe var2 = null;

      try {
         (var2 = aba((byte)-102)).aca.writeInt(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void ala(int var1, int var2) {
      fe var3 = null;

      try {
         (var3 = aba((byte)-104)).aca.writeInt(var1);
         var3.aca.writeInt(var2);
         this.aaa.aaa(var3);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var3.aca();
      }

   }

   public final void bja(int var1) {
      fe var2 = null;

      try {
         (var2 = aba((byte)-103)).aca.writeInt(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void bda() {
      fe var1 = null;

      try {
         var1 = aba((byte)-82);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   public final void bea() {
      fe var1 = null;

      try {
         var1 = aba((byte)-79);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   public final void aaa(gg var1, int var2) {
      fe var3 = null;

      try {
         (var3 = new fe((byte)102)).aca.writeByte(var1.ada);
         var3.aca.writeInt(var2);
         this.aaa.aaa(var3);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var3.aca();
      }

   }

   public final void bka(int var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)104)).aca.writeInt(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void bla(int var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)105)).aca.writeInt(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void bfa() {
      fe var1 = null;

      try {
         (var1 = aba((byte)-72)).aca.writeByte(GameScr.bra);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   public final void aqa(String var1) {
      fe var2 = null;

      try {
         (var2 = aba((byte)-61)).aca.writeByte(GameScr.bra);
         var2.aca.writeUTF(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void bga() {
      fe var1 = null;

      try {
         (var1 = aba((byte)-60)).aca.writeByte(GameScr.bra);
         this.aaa.aaa(var1);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var1.aca();
      }

   }

   private void afa(gg[] var1) {
      GameCanvas.bja.aba();
      fe var2 = null;

      try {
         var2 = new fe((byte)110);

         int var3;
         for(var3 = 0; var3 < var1.length; ++var3) {
            if (var1[var3] != null && (var1[var3].aaa.aaa == 10 || var1[var3].aaa.aaa == 11)) {
               var2.aca.writeByte(var1[var3].ada);
               break;
            }
         }

         for(var3 = 0; var3 < var1.length; ++var3) {
            if (var1[var3] != null && (var1[var3].aaa.aaa == 455 || var1[var3].aaa.aaa == 456)) {
               var2.aca.writeByte(var1[var3].ada);
            }
         }

         this.aaa.aaa(var2);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void ada(gg[] var1) {
      fe var2 = null;

      try {
         var2 = new fe((byte)110);

         int var3;
         for(var3 = 0; var3 < 24; ++var3) {
            if (var1[var3] != null && (var1[var3].aaa.aaa == 10 || var1[var3].aaa.aaa == 11)) {
               var2.aca.writeByte(var1[var3].ada);
               break;
            }
         }

         for(var3 = 0; var3 < 24; ++var3) {
            if (var1[var3] != null && (var1[var3].aaa.aaa == 455 || var1[var3].aaa.aaa == 456)) {
               var2.aca.writeByte(var1[var3].ada);
            }
         }

         this.aaa.aaa(var2);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void aba(gg var1, gg[] var2) {
      GameCanvas.bja.aba();
      fe var3 = null;

      try {
         (var3 = new fe((byte)111)).aca.writeByte(var1.ada);

         for(int var8 = 0; var8 < var2.length; ++var8) {
            if (var2[var8] != null && (var2[var8].aaa.aaa == 455 || var2[var8].aaa.aaa == 456 || var2[var8].aaa.aaa == 457)) {
               var3.aca.writeByte(var2[var8].ada);
            }
         }

         this.aaa.aaa(var3);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var3.aca();
      }

   }

   public final void aca(gg var1, gg[] var2) {
      fe var3 = null;

      try {
         (var3 = new fe((byte)111)).aca.writeByte(var1.ada);

         for(int var8 = 0; var8 < 24; ++var8) {
            if (var2[var8] != null && (var2[var8].aaa.aaa == 455 || var2[var8].aaa.aaa == 456 || var2[var8].aaa.aaa == 457)) {
               var3.aca.writeByte(var2[var8].ada);
            }
         }

         this.aaa.aaa(var3);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var3.aca();
      }

   }

   public final void ada(gg var1, gg[] var2) {
      GameCanvas.bja.aba();
      fe var3 = null;

      try {
         (var3 = new fe((byte)112)).aca.writeByte(var1.ada);
         int var9 = 0;

         for(int var4 = 0; var4 < var2.length; ++var4) {
            if (var2[var4] != null && var2[var4].aaa.aaa == 454) {
               var3.aca.writeByte(var2[var4].ada);
               ++var9;
            }
         }

         if (var9 >= 20) {
            this.aaa.aaa(var3);
            return;
         }

         GameCanvas.aaa(er.swa);
      } catch (Exception var7) {
         var7.printStackTrace();
         return;
      } finally {
         var3.aca();
      }

   }

   public final void bma(int var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)113)).aca.writeShort(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void aaa(String var1, String var2, byte var3) {
      fe var4 = null;
      var1 = var1 + " " + var2;

      try {
         (var4 = new fe((byte)-21)).aca.writeUTF(var1);
         var4.aca.writeByte(var3);
         this.aaa.aaa(var4);
         return;
      } catch (Exception var7) {
      } finally {
         var4.aca();
      }

   }

   public final void aba(short var1, String var2) {
      fe var3 = null;

      try {
         (var3 = new fe((byte)118)).aca.writeUTF(var2);
         var3.aca.writeShort(var1);
         this.aaa.aaa(var3);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var3.aca();
      }

   }

   public final void aaa(short var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)119)).aca.writeByte(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   private void aca(String var1, String var2, String var3) {
      try {
         fe var4;
         (var4 = aaa((byte)-123)).aca.writeUTF(var1);
         var4.aca.writeUTF(var2);
         var4.aca.writeUTF(var3);
         this.aaa.aaa(var4);
         var4.aca();
      } catch (IOException var5) {
         var5.printStackTrace();
      }
   }

   public final void aaa(byte var1, String var2) {
      fe var3 = null;

      try {
         (var3 = new fe((byte)121)).aca.writeByte(var1);
         var3.aca.writeUTF(var2);
         this.aaa.aaa(var3);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var3.aca();
      }

   }

   public final void aaa(byte var1, short var2) {
      fe var3 = null;

      try {
         (var3 = aba((byte)122)).aca.writeByte(var1);
         var3.aca.writeByte(var2);
         this.aaa.aaa(var3);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var3.aca();
      }

   }

   public final void aaa(short var1, String var2, byte var3) {
      fe var4 = null;

      try {
         (var4 = new fe((byte)92)).aca.writeShort(var1);
         var4.aca.writeUTF(var2);
         var4.aca.writeByte(var3);
         this.aaa.aaa(var4);
         return;
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var4.aca();
      }

   }

   private void aaa(String var1, String var2, String var3, String var4, String var5, String var6, String var7) {
      try {
         fe var8;
         (var8 = new fe((byte)123)).aca.writeUTF(var1);
         var8.aca.writeUTF(var2);
         var8.aca.writeUTF(var3);
         var8.aca.writeUTF(var4);
         var8.aca.writeUTF(var5);
         var8.aca.writeUTF(var6);
         var8.aca.writeUTF(var7);
         this.aaa.aaa(var8);
         var8.aca();
      } catch (Exception var9) {
         var9.printStackTrace();
      }
   }

   public final void ada(byte var1) {
      fe var2 = null;

      try {
         (var2 = aba((byte)122)).aca.writeByte(4);
         var2.aca.writeByte(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public final void aaa(byte var1, gg var2, gg var3, gg[] var4) {
      GameCanvas.bja.aba();
      fe var5 = null;

      try {
         (var5 = new fe((byte)124)).aca.writeByte(var1);
         int var10;
         if (var1 == 0) {
            var5.aca.writeByte(var2.ada);
            var5.aca.writeByte(var3.ada);

            for(var10 = 0; var10 < var4.length; ++var10) {
               if (var4[var10] != null) {
                  var5.aca.writeByte(var4[var10].ada);
               }
            }
         } else if (var1 == 1) {
            var5.aca.writeByte(var3.ada);

            for(var10 = 0; var10 < var4.length; ++var10) {
               if (var4[var10] != null) {
                  var5.aca.writeByte(var4[var10].ada);
               }
            }
         } else if (var1 == 2 || var1 == 3) {
            var5.aca.writeByte(var3.ada);
         }

         this.aaa.aaa(var5);
         return;
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var5.aca();
      }

   }

   public final void aea(gg[] var1) {
      GameCanvas.bja.aba();
      fe var2 = null;

      try {
         var2 = new fe((byte)126);

         for(int var3 = 0; var3 < var1.length; ++var3) {
            if (var1[var3] != null) {
               var2.aca.writeByte(var1[var3].ada);
            }
         }

         this.aaa.aaa(var2);
         return;
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   private void aca(short var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)125)).aca.writeByte(1);
         var2.aca.writeShort(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   private void bqa(int var1) {
      fe var2 = null;

      try {
         (var2 = new fe((byte)125)).aca.writeByte(2);
         var2.aca.writeShort(var1);
         this.aaa.aaa(var2);
         return;
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         var2.aca();
      }

   }

   public static void bha() {
   }

   static {
      aa.aaa(71);
      bha();
   }

   public static void bia() {
      aba = null;
   }
}
