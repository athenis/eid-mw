/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.35
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package be.belgium.eid;

public class beidlibJava_Wrapper implements beidlibJava_WrapperConstants {
  public static SWIGTYPE_p_unsigned_long new_ulongp() {
    long cPtr = beidlibJava_WrapperJNI.new_ulongp();
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_long(cPtr, false);
  }

  public static SWIGTYPE_p_unsigned_long copy_ulongp(long value) {
    long cPtr = beidlibJava_WrapperJNI.copy_ulongp(value);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_long(cPtr, false);
  }

  public static void delete_ulongp(SWIGTYPE_p_unsigned_long self) {
    beidlibJava_WrapperJNI.delete_ulongp(SWIGTYPE_p_unsigned_long.getCPtr(self));
  }

  public static void ulongp_assign(SWIGTYPE_p_unsigned_long self, long value) {
    beidlibJava_WrapperJNI.ulongp_assign(SWIGTYPE_p_unsigned_long.getCPtr(self), value);
  }

  public static long ulongp_value(SWIGTYPE_p_unsigned_long self) {
    return beidlibJava_WrapperJNI.ulongp_value(SWIGTYPE_p_unsigned_long.getCPtr(self));
  }

  public static void BEID_LOG(BEID_LogLevel level, String module_name, String format) {
    beidlibJava_WrapperJNI.BEID_LOG(level.swigValue(), module_name, format);
  }

}