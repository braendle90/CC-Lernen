package at.braendle.campus.remote.Classes;

public class Battery {


 public enum CHARGINGSTATUS {EMPTY,FULL,LOW}
 CHARGINGSTATUS chargingstatus ;
 private boolean isLoading ;
 private Remote remote;

 public Remote getRemote() {
  return remote;
 }

 public void setRemote(Remote remote) {
  this.remote = remote;
 }

 public CHARGINGSTATUS getChargingstatus() {
  return chargingstatus;
 }

 public void setChargingstatus(CHARGINGSTATUS chargingstatus) {
  this.chargingstatus = chargingstatus;
 }

 public boolean isLoading() {
  return isLoading;
 }

 public void setLoading(boolean loading) {
  isLoading = loading;
 }
}
