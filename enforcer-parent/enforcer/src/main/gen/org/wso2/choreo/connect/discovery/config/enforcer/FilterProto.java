// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/config/enforcer/filter.proto

package org.wso2.choreo.connect.discovery.config.enforcer;

public final class FilterProto {
  private FilterProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wso2_discovery_config_enforcer_Filter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wso2_discovery_config_enforcer_Filter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+wso2/discovery/config/enforcer/filter." +
      "proto\022\036wso2.discovery.config.enforcer\"-\n" +
      "\006Filter\022\021\n\tclassName\030\001 \001(\t\022\020\n\010position\030\002" +
      " \001(\005B\222\001\n1org.wso2.choreo.connect.discove" +
      "ry.config.enforcerB\013FilterProtoP\001ZNgithu" +
      "b.com/envoyproxy/go-control-plane/wso2/d" +
      "iscovery/config/enforcer;enforcerb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_wso2_discovery_config_enforcer_Filter_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_wso2_discovery_config_enforcer_Filter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wso2_discovery_config_enforcer_Filter_descriptor,
        new java.lang.String[] { "ClassName", "Position", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
