import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Enumeration;

public final class ek extends cu {
   private short aaa;
   private cp aba;
   private int aga;
   private int aha;
   private int aia;
   private int aja;
   private byte aka = 0;
   private long ala = 0L;
   private static fp[] ama;
   private static co ana;
   private static co aoa;
   private boolean apa;

   public static void aaa() {
      ama = new fp[20];
      ana = new co();
      aoa = new co();
   }

   static {
      aa.aaa(39);
      aaa();
   }

   public static void aaa(short var0, int var1, int var2, byte var3, short var4, int var5) {
      ek var6;
      (var6 = new ek()).aaa = var0;
      var6.aga = var1;
      var6.aha = var2;
      var6.aka = var3;
      if (var6.aka < 0) {
         var6.apa = true;
      } else {
         var6.apa = false;
      }

      if (var4 > 0) {
         var6.ala = System.currentTimeMillis() + (long)(var4 * 1000);
      } else {
         var6.ala = -1L;
      }

      var6.aja = var5;
      cu.aca.addElement(var6);
   }

   private fp aha() {
      return ama[this.aaa];
   }

   public final void aaa(as var1) {
      if (this.aba != null && this.aba.aaa != null && this.aha().aca != null) {
         ah var2 = this.aha().aba[this.aha().aca[this.aia]];

         for(int var3 = 0; var3 < var2.aaa.length; ++var3) {
            fp var4 = this.aha();
            byte var5 = var2.aca[var3];
            fh var6 = var4.aaa[var5];
            if (this.aja > 0) {
               var1.aaa(this.aba.aaa, var6.aaa, var6.aba, var6.aca, var6.ada, 0, this.aga + var2.aaa[var3], this.aha + var2.aba[var3] - 1, 20);
            } else {
               var1.aaa(this.aba.aaa, var6.aaa, var6.aba, var6.aca, var6.ada, 2, this.aga - var2.aaa[var3], this.aha + var2.aba[var3] - 1, 24);
            }
         }
      }

   }

   public final void aba() {
      try {
         ama[this.aaa] = (fp)aoa.get(String.valueOf(this.aaa));
         if (ama[this.aaa] == null) {
            ama[this.aaa] = new fp();
            aoa.put(String.valueOf(this.aaa), ama[this.aaa]);
            this.aha().ada = System.currentTimeMillis();
            gm.aaa().aaa((byte)1, (short)this.aaa);
         } else if (this.aha().aca == null && System.currentTimeMillis() - this.aha().ada > 3000L) {
            this.aha().ada = System.currentTimeMillis();
            gm.aaa().aaa((byte)1, (short)this.aaa);
         }

         if (this.aha().aca != null) {
            this.aba = (cp)ana.get(String.valueOf(this.aaa));
            if (this.aba == null) {
               this.aba = new cp();
               ana.put(String.valueOf(this.aaa), this.aba);
               this.aba.aaa = Controller.aaa(fd.aba("effauto " + this.aaa));
               if (this.aba.aaa == null) {
                  this.aba.aba = System.currentTimeMillis();
                  gm.aaa().aaa((byte)0, (short)this.aaa);
               }
            } else if (this.aba.aaa == null && System.currentTimeMillis() - this.aba.aba > 6000L) {
               this.aba.aba = System.currentTimeMillis();
               gm.aaa().aaa((byte)0, (short)this.aaa);
            }
         }

         if (this.aba != null && this.aba.aaa != null && this.aha().aca != null) {
            ++this.aia;
            if (this.aia >= this.aha().aca.length) {
               if (this.ala != -1L) {
                  if (this.ala - System.currentTimeMillis() <= 0L) {
                     cu.aca.removeElement(this);
                  } else {
                     this.aia = 0;
                  }
               } else {
                  label62: {
                     if (!this.apa) {
                        --this.aka;
                        if (this.aka <= 0) {
                           cu.aca.removeElement(this);
                           break label62;
                        }
                     }

                     this.aia = 0;
                  }
               }
            }

            this.aba.aca = System.currentTimeMillis();
            return;
         }
      } catch (Exception var2) {
         System.out.println("Err update effauto:" + var2.toString());
      }

   }

   public static void aaa(short var0, byte[] var1) {
      if (((fp)aoa.get(String.valueOf(var0))).aca == null) {
         new fp();
         fp var2 = aaa(var1);
         aoa.put(String.valueOf(var0), var2);
      }

   }

   private static fp aaa(byte[] var0) {
      try {
         fp var1 = new fp();
         ByteArrayInputStream var6 = new ByteArrayInputStream(var0);
         DataInputStream var7 = new DataInputStream(var6);
         var1.aaa = new fh[var7.readByte()];

         int var2;
         for(var2 = 0; var2 < var1.aaa.length; ++var2) {
            var1.aaa[var2] = new fh();
            var7.readByte();
            var1.aaa[var2].aaa = var7.readUnsignedByte();
            var1.aaa[var2].aba = var7.readUnsignedByte();
            var1.aaa[var2].aca = var7.readUnsignedByte();
            var1.aaa[var2].ada = var7.readUnsignedByte();
         }

         var1.aba = new ah[var7.readShort()];

         int var4;
         for(var2 = 0; var2 < var1.aba.length; ++var2) {
            var1.aba[var2] = new ah();
            byte var3 = var7.readByte();
            var1.aba[var2].aaa = new short[var3];
            var1.aba[var2].aba = new short[var3];
            var1.aba[var2].aca = new byte[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               var1.aba[var2].aaa[var4] = var7.readShort();
               var1.aba[var2].aba[var4] = var7.readShort();
               var1.aba[var2].aca[var4] = var7.readByte();
            }
         }

         short var8 = var7.readShort();
         var1.aca = new short[var8];

         for(var4 = 0; var4 < var8; ++var4) {
            var1.aca[var4] = var7.readShort();
         }

         return var1;
      } catch (Exception var5) {
         return null;
      }
   }

   public static void aaa(byte var0, byte[] var1) {
      cp var2;
      if ((var2 = (cp)ana.get(String.valueOf(var0))) == null) {
         var2 = new cp();
         ana.put(String.valueOf(var0), var2);
      }

      var2.aaa = Controller.aaa(var1);
      if (Class_ab.aea != 1) {
         fd.aaa("effauto ".concat(String.valueOf(var0)), var1);
      }

   }

   public static void aca() {
      try {
         Enumeration var0 = ana.keys();

         while(var0.hasMoreElements()) {
            String var1 = (String)var0.nextElement();
            cp var2 = (cp)ana.get(var1);
            if (System.currentTimeMillis() - var2.aca > 60000L) {
               ana.remove(var1);
            }
         }

      } catch (Exception var3) {
      }
   }

   public static void afa() {
      try {
         Enumeration var0 = aoa.keys();

         while(var0.hasMoreElements()) {
            String var1 = (String)var0.nextElement();
            fp var2 = (fp)aoa.get(var1);
            if (System.currentTimeMillis() - var2.aea > 600000L) {
               aoa.remove(var1);
            }
         }

      } catch (Exception var3) {
      }
   }

   public static void aga() {
      ama = null;
      ana = null;
      aoa = null;
   }
}
