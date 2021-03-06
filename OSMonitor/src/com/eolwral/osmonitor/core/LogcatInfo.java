// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logcatInfo.proto

package com.eolwral.osmonitor.core;

public final class LogcatInfo {
  private LogcatInfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface logcatInfoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required .com.eolwral.osmonitor.core.logcatInfo.logPriority priority = 1 [default = UNKNOWN];
    boolean hasPriority();
    com.eolwral.osmonitor.core.LogcatInfo.logcatInfo.logPriority getPriority();
    
    // required uint64 seconds = 2;
    boolean hasSeconds();
    long getSeconds();
    
    // required uint64 nanoSeconds = 3;
    boolean hasNanoSeconds();
    long getNanoSeconds();
    
    // required uint32 pid = 4;
    boolean hasPid();
    int getPid();
    
    // required uint32 tid = 5;
    boolean hasTid();
    int getTid();
    
    // required string tag = 6;
    boolean hasTag();
    String getTag();
    
    // required string message = 7;
    boolean hasMessage();
    String getMessage();
  }
  public static final class logcatInfo extends
      com.google.protobuf.GeneratedMessage
      implements logcatInfoOrBuilder {
    // Use logcatInfo.newBuilder() to construct.
    private logcatInfo(Builder builder) {
      super(builder);
    }
    private logcatInfo(boolean noInit) {}
    
    private static final logcatInfo defaultInstance;
    public static logcatInfo getDefaultInstance() {
      return defaultInstance;
    }
    
    public logcatInfo getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.eolwral.osmonitor.core.LogcatInfo.internal_static_com_eolwral_osmonitor_core_logcatInfo_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.eolwral.osmonitor.core.LogcatInfo.internal_static_com_eolwral_osmonitor_core_logcatInfo_fieldAccessorTable;
    }
    
    public enum logPriority
        implements com.google.protobuf.ProtocolMessageEnum {
      UNKNOWN(0, 0),
      DEFAULT(1, 1),
      VERBOSE(2, 2),
      DEBUG(3, 3),
      INFO(4, 4),
      WARN(5, 5),
      ERROR(6, 6),
      FATAL(7, 7),
      SILENT(8, 8),
      ;
      
      public static final int UNKNOWN_VALUE = 0;
      public static final int DEFAULT_VALUE = 1;
      public static final int VERBOSE_VALUE = 2;
      public static final int DEBUG_VALUE = 3;
      public static final int INFO_VALUE = 4;
      public static final int WARN_VALUE = 5;
      public static final int ERROR_VALUE = 6;
      public static final int FATAL_VALUE = 7;
      public static final int SILENT_VALUE = 8;
      
      
      public final int getNumber() { return value; }
      
      public static logPriority valueOf(int value) {
        switch (value) {
          case 0: return UNKNOWN;
          case 1: return DEFAULT;
          case 2: return VERBOSE;
          case 3: return DEBUG;
          case 4: return INFO;
          case 5: return WARN;
          case 6: return ERROR;
          case 7: return FATAL;
          case 8: return SILENT;
          default: return null;
        }
      }
      
      public static com.google.protobuf.Internal.EnumLiteMap<logPriority>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<logPriority>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<logPriority>() {
              public logPriority findValueByNumber(int number) {
                return logPriority.valueOf(number);
              }
            };
      
      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.eolwral.osmonitor.core.LogcatInfo.logcatInfo.getDescriptor().getEnumTypes().get(0);
      }
      
      private static final logPriority[] VALUES = {
        UNKNOWN, DEFAULT, VERBOSE, DEBUG, INFO, WARN, ERROR, FATAL, SILENT, 
      };
      
      public static logPriority valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }
      
      private final int index;
      private final int value;
      
      private logPriority(int index, int value) {
        this.index = index;
        this.value = value;
      }
      
      // @@protoc_insertion_point(enum_scope:com.eolwral.osmonitor.core.logcatInfo.logPriority)
    }
    
    private int bitField0_;
    // required .com.eolwral.osmonitor.core.logcatInfo.logPriority priority = 1 [default = UNKNOWN];
    public static final int PRIORITY_FIELD_NUMBER = 1;
    private com.eolwral.osmonitor.core.LogcatInfo.logcatInfo.logPriority priority_;
    public boolean hasPriority() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public com.eolwral.osmonitor.core.LogcatInfo.logcatInfo.logPriority getPriority() {
      return priority_;
    }
    
    // required uint64 seconds = 2;
    public static final int SECONDS_FIELD_NUMBER = 2;
    private long seconds_;
    public boolean hasSeconds() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public long getSeconds() {
      return seconds_;
    }
    
    // required uint64 nanoSeconds = 3;
    public static final int NANOSECONDS_FIELD_NUMBER = 3;
    private long nanoSeconds_;
    public boolean hasNanoSeconds() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public long getNanoSeconds() {
      return nanoSeconds_;
    }
    
    // required uint32 pid = 4;
    public static final int PID_FIELD_NUMBER = 4;
    private int pid_;
    public boolean hasPid() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getPid() {
      return pid_;
    }
    
    // required uint32 tid = 5;
    public static final int TID_FIELD_NUMBER = 5;
    private int tid_;
    public boolean hasTid() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public int getTid() {
      return tid_;
    }
    
    // required string tag = 6;
    public static final int TAG_FIELD_NUMBER = 6;
    private java.lang.Object tag_;
    public boolean hasTag() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public String getTag() {
      java.lang.Object ref = tag_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          tag_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getTagBytes() {
      java.lang.Object ref = tag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        tag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required string message = 7;
    public static final int MESSAGE_FIELD_NUMBER = 7;
    private java.lang.Object message_;
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    public String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          message_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      priority_ = com.eolwral.osmonitor.core.LogcatInfo.logcatInfo.logPriority.UNKNOWN;
      seconds_ = 0L;
      nanoSeconds_ = 0L;
      pid_ = 0;
      tid_ = 0;
      tag_ = "";
      message_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasPriority()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSeconds()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasNanoSeconds()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTag()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasMessage()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, priority_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt64(2, seconds_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt64(3, nanoSeconds_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeUInt32(4, pid_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeUInt32(5, tid_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBytes(6, getTagBytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBytes(7, getMessageBytes());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, priority_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, seconds_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, nanoSeconds_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, pid_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, tid_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(6, getTagBytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(7, getMessageBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.eolwral.osmonitor.core.LogcatInfo.logcatInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.eolwral.osmonitor.core.LogcatInfo.logcatInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.eolwral.osmonitor.core.LogcatInfo.logcatInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.eolwral.osmonitor.core.LogcatInfo.logcatInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.eolwral.osmonitor.core.LogcatInfo.logcatInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.eolwral.osmonitor.core.LogcatInfo.logcatInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.eolwral.osmonitor.core.LogcatInfo.logcatInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.eolwral.osmonitor.core.LogcatInfo.logcatInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.eolwral.osmonitor.core.LogcatInfo.logcatInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.eolwral.osmonitor.core.LogcatInfo.logcatInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.eolwral.osmonitor.core.LogcatInfo.logcatInfo prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.eolwral.osmonitor.core.LogcatInfo.logcatInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.eolwral.osmonitor.core.LogcatInfo.internal_static_com_eolwral_osmonitor_core_logcatInfo_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.eolwral.osmonitor.core.LogcatInfo.internal_static_com_eolwral_osmonitor_core_logcatInfo_fieldAccessorTable;
      }
      
      // Construct using com.eolwral.osmonitor.core.LogcatInfo.logcatInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        priority_ = com.eolwral.osmonitor.core.LogcatInfo.logcatInfo.logPriority.UNKNOWN;
        bitField0_ = (bitField0_ & ~0x00000001);
        seconds_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        nanoSeconds_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        pid_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        tid_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        tag_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        message_ = "";
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.eolwral.osmonitor.core.LogcatInfo.logcatInfo.getDescriptor();
      }
      
      public com.eolwral.osmonitor.core.LogcatInfo.logcatInfo getDefaultInstanceForType() {
        return com.eolwral.osmonitor.core.LogcatInfo.logcatInfo.getDefaultInstance();
      }
      
      public com.eolwral.osmonitor.core.LogcatInfo.logcatInfo build() {
        com.eolwral.osmonitor.core.LogcatInfo.logcatInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.eolwral.osmonitor.core.LogcatInfo.logcatInfo buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.eolwral.osmonitor.core.LogcatInfo.logcatInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.eolwral.osmonitor.core.LogcatInfo.logcatInfo buildPartial() {
        com.eolwral.osmonitor.core.LogcatInfo.logcatInfo result = new com.eolwral.osmonitor.core.LogcatInfo.logcatInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.priority_ = priority_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.seconds_ = seconds_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.nanoSeconds_ = nanoSeconds_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.pid_ = pid_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.tid_ = tid_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.tag_ = tag_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.message_ = message_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.eolwral.osmonitor.core.LogcatInfo.logcatInfo) {
          return mergeFrom((com.eolwral.osmonitor.core.LogcatInfo.logcatInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.eolwral.osmonitor.core.LogcatInfo.logcatInfo other) {
        if (other == com.eolwral.osmonitor.core.LogcatInfo.logcatInfo.getDefaultInstance()) return this;
        if (other.hasPriority()) {
          setPriority(other.getPriority());
        }
        if (other.hasSeconds()) {
          setSeconds(other.getSeconds());
        }
        if (other.hasNanoSeconds()) {
          setNanoSeconds(other.getNanoSeconds());
        }
        if (other.hasPid()) {
          setPid(other.getPid());
        }
        if (other.hasTid()) {
          setTid(other.getTid());
        }
        if (other.hasTag()) {
          setTag(other.getTag());
        }
        if (other.hasMessage()) {
          setMessage(other.getMessage());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasPriority()) {
          
          return false;
        }
        if (!hasSeconds()) {
          
          return false;
        }
        if (!hasNanoSeconds()) {
          
          return false;
        }
        if (!hasPid()) {
          
          return false;
        }
        if (!hasTid()) {
          
          return false;
        }
        if (!hasTag()) {
          
          return false;
        }
        if (!hasMessage()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();
              com.eolwral.osmonitor.core.LogcatInfo.logcatInfo.logPriority value = com.eolwral.osmonitor.core.LogcatInfo.logcatInfo.logPriority.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                priority_ = value;
              }
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              seconds_ = input.readUInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              nanoSeconds_ = input.readUInt64();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              pid_ = input.readUInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              tid_ = input.readUInt32();
              break;
            }
            case 50: {
              bitField0_ |= 0x00000020;
              tag_ = input.readBytes();
              break;
            }
            case 58: {
              bitField0_ |= 0x00000040;
              message_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required .com.eolwral.osmonitor.core.logcatInfo.logPriority priority = 1 [default = UNKNOWN];
      private com.eolwral.osmonitor.core.LogcatInfo.logcatInfo.logPriority priority_ = com.eolwral.osmonitor.core.LogcatInfo.logcatInfo.logPriority.UNKNOWN;
      public boolean hasPriority() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public com.eolwral.osmonitor.core.LogcatInfo.logcatInfo.logPriority getPriority() {
        return priority_;
      }
      public Builder setPriority(com.eolwral.osmonitor.core.LogcatInfo.logcatInfo.logPriority value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        priority_ = value;
        onChanged();
        return this;
      }
      public Builder clearPriority() {
        bitField0_ = (bitField0_ & ~0x00000001);
        priority_ = com.eolwral.osmonitor.core.LogcatInfo.logcatInfo.logPriority.UNKNOWN;
        onChanged();
        return this;
      }
      
      // required uint64 seconds = 2;
      private long seconds_ ;
      public boolean hasSeconds() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public long getSeconds() {
        return seconds_;
      }
      public Builder setSeconds(long value) {
        bitField0_ |= 0x00000002;
        seconds_ = value;
        onChanged();
        return this;
      }
      public Builder clearSeconds() {
        bitField0_ = (bitField0_ & ~0x00000002);
        seconds_ = 0L;
        onChanged();
        return this;
      }
      
      // required uint64 nanoSeconds = 3;
      private long nanoSeconds_ ;
      public boolean hasNanoSeconds() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public long getNanoSeconds() {
        return nanoSeconds_;
      }
      public Builder setNanoSeconds(long value) {
        bitField0_ |= 0x00000004;
        nanoSeconds_ = value;
        onChanged();
        return this;
      }
      public Builder clearNanoSeconds() {
        bitField0_ = (bitField0_ & ~0x00000004);
        nanoSeconds_ = 0L;
        onChanged();
        return this;
      }
      
      // required uint32 pid = 4;
      private int pid_ ;
      public boolean hasPid() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getPid() {
        return pid_;
      }
      public Builder setPid(int value) {
        bitField0_ |= 0x00000008;
        pid_ = value;
        onChanged();
        return this;
      }
      public Builder clearPid() {
        bitField0_ = (bitField0_ & ~0x00000008);
        pid_ = 0;
        onChanged();
        return this;
      }
      
      // required uint32 tid = 5;
      private int tid_ ;
      public boolean hasTid() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public int getTid() {
        return tid_;
      }
      public Builder setTid(int value) {
        bitField0_ |= 0x00000010;
        tid_ = value;
        onChanged();
        return this;
      }
      public Builder clearTid() {
        bitField0_ = (bitField0_ & ~0x00000010);
        tid_ = 0;
        onChanged();
        return this;
      }
      
      // required string tag = 6;
      private java.lang.Object tag_ = "";
      public boolean hasTag() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public String getTag() {
        java.lang.Object ref = tag_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          tag_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setTag(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        tag_ = value;
        onChanged();
        return this;
      }
      public Builder clearTag() {
        bitField0_ = (bitField0_ & ~0x00000020);
        tag_ = getDefaultInstance().getTag();
        onChanged();
        return this;
      }
      void setTag(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000020;
        tag_ = value;
        onChanged();
      }
      
      // required string message = 7;
      private java.lang.Object message_ = "";
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          message_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setMessage(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        message_ = value;
        onChanged();
        return this;
      }
      public Builder clearMessage() {
        bitField0_ = (bitField0_ & ~0x00000040);
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      void setMessage(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000040;
        message_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:com.eolwral.osmonitor.core.logcatInfo)
    }
    
    static {
      defaultInstance = new logcatInfo(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.eolwral.osmonitor.core.logcatInfo)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_eolwral_osmonitor_core_logcatInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_eolwral_osmonitor_core_logcatInfo_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020logcatInfo.proto\022\032com.eolwral.osmonito" +
      "r.core\"\260\002\n\nlogcatInfo\022M\n\010priority\030\001 \002(\0162" +
      "2.com.eolwral.osmonitor.core.logcatInfo." +
      "logPriority:\007UNKNOWN\022\017\n\007seconds\030\002 \002(\004\022\023\n" +
      "\013nanoSeconds\030\003 \002(\004\022\013\n\003pid\030\004 \002(\r\022\013\n\003tid\030\005" +
      " \002(\r\022\013\n\003tag\030\006 \002(\t\022\017\n\007message\030\007 \002(\t\"u\n\013lo" +
      "gPriority\022\013\n\007UNKNOWN\020\000\022\013\n\007DEFAULT\020\001\022\013\n\007V" +
      "ERBOSE\020\002\022\t\n\005DEBUG\020\003\022\010\n\004INFO\020\004\022\010\n\004WARN\020\005\022" +
      "\t\n\005ERROR\020\006\022\t\n\005FATAL\020\007\022\n\n\006SILENT\020\010"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_eolwral_osmonitor_core_logcatInfo_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_eolwral_osmonitor_core_logcatInfo_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_eolwral_osmonitor_core_logcatInfo_descriptor,
              new java.lang.String[] { "Priority", "Seconds", "NanoSeconds", "Pid", "Tid", "Tag", "Message", },
              com.eolwral.osmonitor.core.LogcatInfo.logcatInfo.class,
              com.eolwral.osmonitor.core.LogcatInfo.logcatInfo.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
