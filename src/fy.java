import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

public final class fy {
   public ev aaa = new ev();
   public fo[] aba;
   public byte[][] aca;
   public byte[] ada;
   private byte ala;
   private byte ama;
   private boolean ana;
   public short aea;
   private byte aoa;
   public byte[] afa;
   public long aga;
   private long apa;
   public int aha;
   public boolean aia;
   private boolean aqa;
   public int aja;
   public int aka;

   public fy() {
      new ev();
      this.aca = new byte[4][];
      new ev();
      this.aea = 0;
      this.aoa = 0;
      this.afa = new byte[4];
      new ev();
   }

   private void aba() {
      try {
         fs var1;
         if ((var1 = (fs)bf.aba.get("" + this.aea)) == null) {
            DataInputStream var4;
            if ((var4 = ci.aaa("/effdata/" + this.aea)) != null) {
               byte[] var2 = new byte[(short)var4.available()];
               var4.read(var2, 0, var2.length);
               this.aaa(var2);
               return;
            }

            bf.aaa(this.aea);
            return;
         }

         if (var1 != null && var1.aha) {
            this.aaa = var1.aaa;
            this.aba = var1.aba;
            this.aja = var1.aea;
            this.aka = var1.afa;
            this.ada = var1.ada;
            this.afa = var1.aga;
            this.aca = var1.aca;
            this.ana = var1.aha;
            return;
         }
      } catch (Exception var3) {
         var3.printStackTrace();
         bf.aaa(this.aea);
      }

   }

   public final void aaa(byte[] var1) {
      if (var1 != null) {
         DataInputStream var2 = null;

         try {
            this.aaa.removeAllElements();
            this.aba = null;
            byte var20 = (var2 = new DataInputStream(new ByteArrayInputStream(var1))).readByte();
            this.aba = new fo[var20];

            int var3;
            for(var3 = 0; var3 < var20; ++var3) {
               fo[] var10000 = this.aba;
               var2.readUnsignedByte();
               var10000[var3] = new fo(var2.readUnsignedByte(), var2.readUnsignedByte(), var2.readUnsignedByte(), var2.readUnsignedByte());
            }

            var3 = 0;
            short var21 = var2.readShort();

            for(int var4 = 0; var4 < var21; ++var4) {
               byte var5 = var2.readByte();
               ev var6 = new ev();
               ev var7 = new ev();

               for(int var8 = 0; var8 < var5; ++var8) {
                  ew var9;
                  (var9 = new ew(var2.readShort(), var2.readShort(), var2.readByte())).ada = var2.readByte();
                  var9.aea = var2.readByte();
                  if (var9.aea == 0) {
                     var6.addElement(var9);
                  } else {
                     var7.addElement(var9);
                  }

                  if (var3 < ci.aea(var9.aca)) {
                     var3 = ci.aea(var9.aca);
                  }
               }

               this.aaa.addElement(new ar(var6, var7));
            }

            this.aja = this.aba[0].ada;
            this.aka = (short)var3;
            short var22 = (short)var2.readUnsignedByte();
            this.ada = new byte[var22];

            int var23;
            for(var23 = 0; var23 < var22; ++var23) {
               this.ada[var23] = (byte)var2.readShort();
            }

            var2.readByte();
            byte var24 = var2.readByte();
            this.aca[0] = new byte[var24];

            for(var23 = 0; var23 < var24; ++var23) {
               this.aca[0][var23] = var2.readByte();
            }

            var24 = var2.readByte();
            this.aca[1] = new byte[var24];

            for(var23 = 0; var23 < var24; ++var23) {
               this.aca[1][var23] = var2.readByte();
            }

            var24 = var2.readByte();
            this.aca[3] = new byte[var24];

            for(var23 = 0; var23 < var24; ++var23) {
               this.aca[3][var23] = var2.readByte();
            }

            this.ana = true;

            try {
               this.afa[0] = (byte)(this.aca[0].length - 7);
               this.afa[1] = (byte)(this.aca[1].length - 7);
               this.afa[2] = (byte)(this.aca[3].length - 7);
               this.afa[3] = (byte)(this.aca[3].length - 7);
            } catch (Exception var17) {
            }

            this.afa[0] = var2.readByte();
            this.afa[1] = var2.readByte();
            this.afa[2] = var2.readByte();
            this.afa[3] = this.afa[2];
            return;
         } catch (Exception var18) {
         } finally {
            try {
               var2.close();
            } catch (Exception var16) {
            }

         }

      }
   }

   public fy(short var1, long var2, int var4) {
      new ev();
      this.aca = new byte[4][];
      new ev();
      this.aea = 0;
      this.aoa = 0;
      this.afa = new byte[4];
      new ev();
      this.aea = var1;
      this.aga = var2;
      this.aha = var4;
      this.aba();
      if (var2 == -1L) {
         this.aoa = 3;
      } else if (var2 == 0L) {
         this.aoa = 1;
      } else {
         this.aoa = 2;
      }
   }

   private boolean aca() {
      if (this.ana) {
         return true;
      } else {
         this.aba();
         return false;
      }
   }

   public final void aaa(as var1, int var2, int var3) {
      try {
         if (!this.aca()) {
            return;
         }

         if (this.aqa) {
            return;
         }

         if (this.ala < this.aaa.size()) {
            ev var4 = ((ar)this.aaa.elementAt(this.ala)).aaa;

            for(int var5 = 0; var5 < var4.size(); ++var5) {
               ew var6 = (ew)var4.elementAt(var5);
               fo var7 = this.aba[var6.aaa];
               eh var8;
               if ((var8 = bf.aba(this.aea)) != null && var8.aaa != null) {
                  short var9 = var6.aba;
                  int var10 = var7.ada;
                  int var11 = var7.aea;
                  short var12 = var7.aba;
                  short var14 = var7.aca;
                  if (var12 > var8.aaa.getWidth()) {
                     var12 = 0;
                  }

                  if (var14 > var8.aaa.getHeight()) {
                     var14 = 0;
                  }

                  if (var12 + var10 > var8.aaa.getWidth()) {
                     var10 = var8.aaa.getWidth() - var12;
                  }

                  if (var14 + var11 > var8.aaa.getHeight()) {
                     var11 = var8.aaa.getHeight() - var14;
                  }

                  var1.aaa(var8.aaa, var12, var14, var10, var11, var6.ada == 1 ? 2 : 0, var2 + var9, var3 + var6.aca, 0);
               }
            }

            return;
         }
      } catch (Exception var13) {
         var13.printStackTrace();
         System.err.println("Err DataSkillEff  paintBottomEff:" + this.aea);
      }

   }

   public final void aba(as var1, int var2, int var3) {
      try {
         if (!this.aca()) {
            return;
         }

         if (this.aqa) {
            return;
         }

         if (this.ala < this.aaa.size()) {
            ev var4 = ((ar)this.aaa.elementAt(this.ala)).aba;

            for(int var5 = 0; var5 < var4.size(); ++var5) {
               ew var6 = (ew)var4.elementAt(var5);
               fo var7 = this.aba[var6.aaa];
               eh var8;
               if ((var8 = bf.aba(this.aea)) != null && var8.aaa != null) {
                  short var9 = var6.aba;
                  int var10 = var7.ada;
                  int var11 = var7.aea;
                  short var12 = var7.aba;
                  short var14 = var7.aca;
                  if (var12 > var8.aaa.getWidth()) {
                     var12 = 0;
                  }

                  if (var14 > var8.aaa.getHeight()) {
                     var14 = 0;
                  }

                  if (var12 + var10 > var8.aaa.getWidth()) {
                     var10 = var8.aaa.getWidth() - var12;
                  }

                  if (var14 + var11 > var8.aaa.getHeight()) {
                     var11 = var8.aaa.getHeight() - var14;
                  }

                  var1.aaa(var8.aaa, var12, var14, var10, var11, var6.ada == 1 ? 2 : 0, var2 + var9, var3 + var6.aca, 0);
               }
            }

            return;
         }
      } catch (Exception var13) {
         var13.printStackTrace();
         System.err.println("Err DataSkillEff  paintBottomEff:" + this.aea);
      }

   }

   private void aaa(boolean var1) {
      if (this.aha > 0) {
         this.aqa = var1;
         if (this.aqa) {
            this.apa = System.currentTimeMillis() + (long)this.aha;
            return;
         }
      } else {
         this.aqa = false;
      }

   }

   public final void aaa() {
      if (this.aaa.size() > 0) {
         try {
            if (!this.aqa) {
               switch(this.aoa) {
               case 0:
                  ++this.ama;
                  if (this.ama > this.ada.length) {
                     this.aia = true;
                     this.ama = 0;
                  }

                  this.ala = this.ada[this.ama];
                  return;
               case 1:
                  ++this.ama;
                  if (this.ama > this.ada.length) {
                     this.ama = 0;
                     this.aia = true;
                  }

                  this.ala = this.ada[this.ama];
                  return;
               case 2:
                  ++this.ama;
                  if (this.ama == (byte)(this.ada.length - 1) && this.aga - System.currentTimeMillis() < 0L) {
                     this.aia = true;
                  }

                  if (this.ama > this.ada.length) {
                     this.ama = 0;
                     this.aaa(true);
                  }

                  this.ala = this.ada[this.ama];
                  return;
               case 3:
                  ++this.ama;
                  if (this.ama > this.ada.length) {
                     this.ama = 0;
                     this.aaa(true);
                  }

                  this.ala = this.ada[this.ama];
                  return;
               default:
                  return;
               }
            }

            if (this.apa - System.currentTimeMillis() < 0L) {
               this.aaa(false);
               return;
            }
         } catch (Exception var1) {
         }
      }

   }
}
