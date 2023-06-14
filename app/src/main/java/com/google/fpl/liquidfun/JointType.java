/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.fpl.liquidfun;

public enum JointType {
  e_unknownJoint,
  e_revoluteJoint,
  e_prismaticJoint,
  e_distanceJoint,
  e_pulleyJoint,
  e_mouseJoint,
  e_gearJoint,
  e_wheelJoint,
  e_weldJoint,
  e_frictionJoint,
  e_ropeJoint,
  e_motorJoint;

  public final int swigValue() {
    return swigValue;
  }

  public static JointType swigToEnum(int swigValue) {
    JointType[] swigValues = JointType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (JointType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + JointType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private JointType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private JointType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private JointType(JointType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}
