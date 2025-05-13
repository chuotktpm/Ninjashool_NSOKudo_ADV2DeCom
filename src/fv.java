public final class fv extends Auto {
   private int aba;
   private int aca;
   private boolean ada;
   private boolean aea;
   private boolean bha;
   private String bia;
   private ev bja;
   private ev bka;
   private long bla;
   public static boolean aaa;

   public final void aaa(String var1, int var2) {
      if (aw.ada()) {
         Service.aaa().aka(var2);
         this.bia = var1;
         this.bha = true;
         this.aea = true;
         this.bja = null;
         this.bka = null;
         this.ada = true;
      } else {
         Service.aaa().aha();
         Code.aaa(var1, "<Hiện mk ko mua vp nào>");
      }
   }

   public final void aaa(String var1, String var2) {
      String[] var15 = Code.aca(var2, " ");
      if (this.ada) {
         if (!GameScr.dpa) {
            Code.aaa(var1, "<Đang giao dịch với người khác. Mong bạn chờ giây lát>");
         }

      } else {
         ev var3;
         ev var4;
         int var5;
         int var6;
         int var7;
         String var8;
         String var9;
         fd var10;
         int var11;
         int var12;
         if (var15[0].toLowerCase().equals("buy")) {
            var3 = new ev();
            var4 = new ev();
            var5 = 0;
            var6 = 1;

            for(var7 = var15.length - 1; var6 <= var7; var6 += 2) {
               var8 = var15[var6];
               var9 = var15[var6 + 1];
               if ((var10 = aw.aaa(var8)) != null && var10.aca > 0) {
                  if (var10.aca > 0 && fz.aka(var10.aaa.aaa) <= var10.aea) {
                     Code.aaa(var1, "<" + var8 + " hết hàng>");
                  } else {
                     try {
                        var11 = Integer.parseInt(var9);
                     } catch (Exception var13) {
                        Code.aaa(var1, "<" + var8 + " số lượng lỗi>");
                        continue;
                     }

                     if (var10.ada() < var11) {
                        Code.aaa(var1, "<" + var8 + " số lượng Item này hiện không đủ>");
                     } else {
                        var12 = var10.aaa.aia ? 1 : var11;
                        if (var5 + var12 > 12) {
                           Code.aaa(var1, "<" + var8 + " số lượng đầy. VP sau sẽ k dc tính>");
                           break;
                        }

                        var5 += var12;
                        var3.addElement(var10);
                        var4.addElement(var11);
                     }
                  }
               } else {
                  Code.aaa(var1, "<" + var8 + " ko tồn tại hoặc mk ko bán vp này>");
               }
            }

            if (var3.size() == 0) {
               Code.aaa(var1, "<Giao dịch rỗng>");
            } else {
               this.bia = var1;
               this.bha = false;
               this.bja = var3;
               this.bka = var4;
               this.ada = true;
            }
         } else if (!var15[0].toLowerCase().equals("mua")) {
            if (var15[0].toLowerCase().equals("donate")) {
               this.bia = var1;
               this.bha = false;
               this.bja = null;
               this.bka = null;
               this.ada = true;
            } else if (var15[0].toLowerCase().equals("sell")) {
               if (aw.ada()) {
                  this.bia = var1;
                  this.bha = true;
                  this.aea = false;
                  this.bja = null;
                  this.bka = null;
                  this.ada = true;
               } else {
                  Code.aaa(var1, "<Hiện mk ko mua vp nào>");
               }
            } else {
               Code.aaa(var1, "<Bán hàng tự động v4 By Leo>");
               Code.aaa(var1, "<Danh sách hàng>");
               aw.aba(var1);
               Code.aaa(var1, "<-------------------------->");
               aw.aca(var1);
               Code.aaa(var1, "<-------------------------->");
            }
         } else {
            var3 = new ev();
            var4 = new ev();
            var5 = 0;
            var6 = 1;

            for(var7 = var15.length - 1; var6 <= var7; var6 += 2) {
               var8 = var15[var6];
               if ((var10 = aw.aaa(var9 = var15[var6 + 1])) != null && var10.aca > 0) {
                  if (var10.aca > 0 && fz.aka(var10.aaa.aaa) <= var10.aea) {
                     Code.aaa(var1, "<" + var9 + " hết hàng>");
                  } else {
                     try {
                        var11 = Integer.parseInt(var8);
                     } catch (Exception var14) {
                        Code.aaa(var1, "<" + var9 + " số lượng lỗi>");
                        continue;
                     }

                     if (var10.ada() < var11) {
                        Code.aaa(var1, "<" + var9 + " số lượng Item này hiện không đủ>");
                     } else {
                        var12 = var10.aaa.aia ? 1 : var11;
                        if (var5 + var12 > 12) {
                           Code.aaa(var1, "<" + var9 + " số lượng đầy. VP sau sẽ k dc tính>");
                           break;
                        }

                        var5 += var12;
                        var3.addElement(var10);
                        var4.addElement(var11);
                     }
                  }
               } else {
                  Code.aaa(var1, "<" + var9 + " ko tồn tại hoặc mk ko bán vp này>");
               }
            }

            if (var3.size() == 0) {
               Code.aaa(var1, "<Giao dịch rỗng>");
            } else {
               this.bia = var1;
               this.bha = false;
               this.bja = var3;
               this.bka = var4;
               this.ada = true;
            }
         }
      }
   }

   public final void a_() {
      super.a_();
      super.aga = gn.aoa;
      super.aha = gn.ala;
      this.aba = fz.ala().ala;
      this.aca = fz.ala().ama;
      this.bla = 0L;
      this.ada = false;
      aw.aaa = -1;
   }

   private void aaa(fz var1) {
      gg[] var2 = new gg[12];
      aaa = false;
      long var3;
      if (!this.aea) {
         if (!fz.ada(var1.ala, var1.ama)) {
            Code.aaa(this.bia, "<Hãy đứng ở nơi dễ GD>");
            return;
         }

         Service.aaa().aqa(var1.asa);
         if (!LockGame.bba()) {
            if (GameScr.dpa) {
               Service.aaa().aia();
               Thread.sleep(1000L);
            }

            Code.aaa(this.bia, "<Hãy đồng ý giao dịch>");
            return;
         }
      } else {
         var3 = System.currentTimeMillis();

         while(!GameScr.dpa || System.currentTimeMillis() - var3 >= 10000L) {
            Thread.sleep(1000L);
         }
      }

      var3 = System.currentTimeMillis();

      while(GameScr.ava().ega != 1) {
         if (aaa || System.currentTimeMillis() - var3 >= 20000L) {
            if (GameScr.dpa) {
               Service.aaa().aia();
               Thread.sleep(1000L);
            }

            Code.aaa(this.bia, "<Hãy giao dịch lại>");
            return;
         }

         Thread.sleep(200L);
      }

      ev var8 = new ev();
      ev var9 = new ev();

      int var4;
      int var7;
      int var10;
      for(var4 = 0; var4 < GameScr.daa.length; ++var4) {
         if (GameScr.daa[var4] != null) {
            fd var5;
            if ((var5 = aw.aaa(GameScr.daa[var4].aaa.aaa)) == null || !var5.aca()) {
               if (GameScr.dpa) {
                  Service.aaa().aia();
                  Thread.sleep(1000L);
               }

               Code.aaa(this.bia, "<Item " + var4 + ": bạn đã GD vp mk ko mua>");
               return;
            }

            int var6 = GameScr.daa[var4].aaa.aia ? GameScr.daa[var4].ada : 1;
            if (var8.contains(var5)) {
               var7 = var8.indexOf(var5);
               var10 = (Integer)var9.elementAt(var7) + var6;
               var9.setElementAt(var10, var7);
            } else {
               var8.addElement(var5);
               var9.addElement(var6);
            }
         }
      }

      if (var8.size() == 0) {
         if (GameScr.dpa) {
            Service.aaa().aia();
            Thread.sleep(1000L);
         }

         Code.aaa(this.bia, "<Giao dịch trống>");
      } else {
         var4 = 0;

         for(var10 = 0; var10 < var8.size(); ++var10) {
            fd var11 = (fd)var8.elementAt(var10);
            var7 = (Integer)var9.elementAt(var10);
            if (fz.aka(var11.aaa.aaa) + var7 > var11.aha) {
               if (GameScr.dpa) {
                  Service.aaa().aia();
                  Thread.sleep(1000L);
               }

               Code.aaa(this.bia, "<" + var11.aaa.ada + " bạn đá bán quá số mk cần mua>");
               return;
            }

            var4 += var7 * var11.aga * 1000 / var11.afa;
         }

         if (var4 > fz.ala().cqa) {
            if (GameScr.dpa) {
               Service.aaa().aia();
            }

            Code.aaa(this.bia, "<Hiện mk ko đủ xu, xin bạn quay lại sau>");
         } else {
            GameScr.ava().eha = var4;
            GameScr.cza = var2;
            Service.aaa().aaa(var4, var2);
            GameScr.ava().efa = 1;
            var3 = System.currentTimeMillis();

            while(System.currentTimeMillis() - var3 < 5000L) {
               if (aaa) {
                  Code.aaa(this.bia, "<Hãy giao dịch lại>");
                  return;
               }

               Thread.sleep(200L);
            }

            Service.aaa().aja();
            GameScr.ava().efa = 2;

            while(GameScr.ava().eha < 2) {
               if (aaa || System.currentTimeMillis() - var3 >= 20000L) {
                  if (GameScr.dpa) {
                     Service.aaa().aia();
                     Thread.sleep(1000L);
                  }

                  Code.aaa(this.bia, "<Hãy giao dịch lại>");
                  return;
               }

               Thread.sleep(200L);
            }

         }
      }
   }

   private void afa(fz var1) {
      gg[] var2 = new gg[12];
      int var3 = 0;
      int var4 = 0;
      boolean var5 = false;
      int var6;
      int var8;
      if (this.bja != null) {
         for(var6 = 0; var6 < this.bja.size(); ++var6) {
            fd var7 = (fd)this.bja.elementAt(var6);
            var8 = (Integer)this.bka.elementAt(var6);
            if (var7.aaa.aia) {
               gg var15;
               if ((var15 = fz.afa(var7.aaa.aaa)) == null) {
                  Code.aaa(this.bia, "<Xin lỗi, có lỗi chọn item>");
                  return;
               }

               Service.aaa().aka(var15.ada, var8);
               LockGame.ata();
               if ((var15 = fz.aba(var7.aaa.aaa, var8)) == null) {
                  Code.aaa(this.bia, "<Xin lỗi, có lỗi chọn item>");
                  return;
               }

               var2[var3++] = var15;
               var5 = true;
            } else {
               fz var9 = fz.ala();
               int var10 = 0;

               label184:
               for(int var11 = 0; var10 < var8; ++var10) {
                  while(var11 < var9.arrItemBag.length) {
                     gg var12;
                     if ((var12 = var9.arrItemBag[var11]) != null && var12.aaa.aaa == var7.aaa.aaa) {
                        var2[var3++] = var12;
                        ++var11;
                        continue label184;
                     }

                     ++var11;
                  }

                  Code.aaa(this.bia, "<Xin lỗi, có lỗi chọn item>");
                  return;
               }
            }

            var4 += var8 * var7.ada * 1000 / var7.aca;
         }

         if (var4 == 0) {
            var4 = 1;
         }
      }

      aaa = false;
      if (!fz.ada(var1.ala, var1.ama)) {
         Code.aaa(this.bia, "<Hãy đứng ở nơi dễ GD>");
         if (var5) {
            Service.aaa().afa();
            LockGame.ata();
         }

      } else {
         Service.aaa().aqa(var1.asa);
         if (!LockGame.bba()) {
            if (GameScr.dpa) {
               Service.aaa().aia();
               Thread.sleep(1000L);
            }

            if (var5) {
               Service.aaa().afa();
               LockGame.ata();
            }

            Code.aaa(this.bia, "<Hãy đồng ý giao dịch>");
         } else {
            GameScr.ava().eha = 0;
            GameScr.cza = new gg[12];

            for(var6 = 0; var6 < 12; ++var6) {
               GameScr.cza[var6] = var2[var6];
               if (var2[var6] != null && var2[var6].ada >= 0 && var2[var6].ada < fz.ala().arrItemBag.length) {
                  int var10001 = var2[var6].ada;
                  fz.ala().arrItemBag[var10001] = null;
               }
            }

            Service.aaa().aaa((int)0, (gg[])var2);
            GameScr.ava().efa = 1;
            long var13 = System.currentTimeMillis();

            while(GameScr.ava().ega != 1) {
               if (aaa || System.currentTimeMillis() - var13 >= 20000L) {
                  if (GameScr.dpa) {
                     Service.aaa().aia();
                     Thread.sleep(1000L);
                  }

                  if (var5) {
                     Service.aaa().afa();
                     LockGame.ata();
                  }

                  Code.aaa(this.bia, "<Hãy giao dịch lại>");
                  return;
               }

               Thread.sleep(200L);
            }

            var13 = System.currentTimeMillis();
            if (GameScr.ava().eia < var4) {
               if (GameScr.dpa) {
                  Service.aaa().aia();
                  Thread.sleep(1000L);
               }

               if (var5) {
                  Service.aaa().afa();
                  LockGame.ata();
               }

               Code.aaa(this.bia, "<Không đủ xu>");
            } else {
               for(var8 = 0; var8 < GameScr.daa.length; ++var8) {
                  if (GameScr.daa[var8] != null && aw.aaa(GameScr.daa[var8].aaa.aaa) == null) {
                     if (GameScr.dpa) {
                        Service.aaa().aia();
                        Thread.sleep(1000L);
                     }

                     if (var5) {
                        Service.aaa().afa();
                        LockGame.ata();
                     }

                     Code.aaa(this.bia, "<Chỉ GD xu>");
                     return;
                  }
               }

               while(System.currentTimeMillis() - var13 < 6000L) {
                  if (aaa) {
                     if (var5) {
                        Service.aaa().afa();
                        LockGame.ata();
                     }

                     Code.aaa(this.bia, "<Hãy giao dịch lại>");
                     return;
                  }

                  Thread.sleep(200L);
               }

               Service.aaa().aja();
               GameScr.ava().efa = 2;

               while(GameScr.ava().ega < 2) {
                  if (aaa || System.currentTimeMillis() - var13 >= 20000L) {
                     if (GameScr.dpa) {
                        Service.aaa().aia();
                        Thread.sleep(1000L);
                     }

                     if (var5) {
                        Service.aaa().afa();
                        LockGame.ata();
                     }

                     Code.aaa(this.bia, "<Hãy giao dịch lại>");
                     return;
                  }

                  Thread.sleep(200L);
               }

            }
         }
      }
   }

   public final void aaa() {
      if (Auto.aka()) {
         Auto.aaa(true);
      } else if (super.aga == gn.aoa && super.aha == gn.ala) {
         if (this.ada) {
            String var1 = this.bia;
            int var5 = 0;

            fz var10000;
            while(true) {
               if (var5 >= GameScr.bla.size()) {
                  var10000 = null;
                  break;
               }

               fz var3;
               if ((var3 = (fz)GameScr.bla.elementAt(var5)).cea.equals(var1)) {
                  var10000 = var3;
                  break;
               }

               ++var5;
            }

            fz var4 = var10000;
            if (var10000 == null) {
               if (this.bia != null) {
                  Code.aaa(this.bia, "<Hãy đến " + gn.ava[gn.aoa] + " khu " + gn.ala + " để giao dịch>");
               }

               this.ada = false;
            } else {
               if (this.bha) {
                  this.aaa(var4);
               } else {
                  this.afa(var4);
               }

               Thread.sleep(500L);
               this.ada = false;
            }
         } else {
            if (fz.ala().ala != this.aba || fz.ala().ama != this.aca) {
               fz.aca(this.aba, this.aca);
               Thread.sleep(500L);
            }

            String var2;
            if (System.currentTimeMillis() - this.bla >= 5000L && !(var2 = aw.aca()).equals("")) {
               Service.aaa().aca(var2);
               this.bla = System.currentTimeMillis();
            }

         }
      } else {
         this.aaa(super.aga, super.aha, -1, -1);
      }
   }

   public final String toString() {
      return "Auto Sell";
   }

   public static void aea() {
   }

   static {
      aa.aaa(58);
      aea();
   }

   public static void afa() {
      aaa = false;
   }
}
