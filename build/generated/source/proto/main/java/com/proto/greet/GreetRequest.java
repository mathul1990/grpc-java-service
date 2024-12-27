// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: greet/greet.proto

// Protobuf Java Version: 3.25.5
package com.proto.greet;

/**
 * Protobuf type {@code greet.GreetRequest}
 */
public final class GreetRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:greet.GreetRequest)
    GreetRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GreetRequest.newBuilder() to construct.
  private GreetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GreetRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GreetRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.proto.greet.Greet.internal_static_greet_GreetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.greet.Greet.internal_static_greet_GreetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.greet.GreetRequest.class, com.proto.greet.GreetRequest.Builder.class);
  }

  private int bitField0_;
  public static final int GREETING_FIELD_NUMBER = 1;
  private com.proto.greet.Greeting greeting_;
  /**
   * <code>.greet.Greeting greeting = 1;</code>
   * @return Whether the greeting field is set.
   */
  @java.lang.Override
  public boolean hasGreeting() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.greet.Greeting greeting = 1;</code>
   * @return The greeting.
   */
  @java.lang.Override
  public com.proto.greet.Greeting getGreeting() {
    return greeting_ == null ? com.proto.greet.Greeting.getDefaultInstance() : greeting_;
  }
  /**
   * <code>.greet.Greeting greeting = 1;</code>
   */
  @java.lang.Override
  public com.proto.greet.GreetingOrBuilder getGreetingOrBuilder() {
    return greeting_ == null ? com.proto.greet.Greeting.getDefaultInstance() : greeting_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getGreeting());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGreeting());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.proto.greet.GreetRequest)) {
      return super.equals(obj);
    }
    com.proto.greet.GreetRequest other = (com.proto.greet.GreetRequest) obj;

    if (hasGreeting() != other.hasGreeting()) return false;
    if (hasGreeting()) {
      if (!getGreeting()
          .equals(other.getGreeting())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasGreeting()) {
      hash = (37 * hash) + GREETING_FIELD_NUMBER;
      hash = (53 * hash) + getGreeting().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.greet.GreetRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.greet.GreetRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.greet.GreetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.greet.GreetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.greet.GreetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.greet.GreetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.greet.GreetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.greet.GreetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.proto.greet.GreetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.proto.greet.GreetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.greet.GreetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.greet.GreetRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.proto.greet.GreetRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code greet.GreetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:greet.GreetRequest)
      com.proto.greet.GreetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.greet.Greet.internal_static_greet_GreetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.greet.Greet.internal_static_greet_GreetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.greet.GreetRequest.class, com.proto.greet.GreetRequest.Builder.class);
    }

    // Construct using com.proto.greet.GreetRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getGreetingFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      greeting_ = null;
      if (greetingBuilder_ != null) {
        greetingBuilder_.dispose();
        greetingBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.greet.Greet.internal_static_greet_GreetRequest_descriptor;
    }

    @java.lang.Override
    public com.proto.greet.GreetRequest getDefaultInstanceForType() {
      return com.proto.greet.GreetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.greet.GreetRequest build() {
      com.proto.greet.GreetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.greet.GreetRequest buildPartial() {
      com.proto.greet.GreetRequest result = new com.proto.greet.GreetRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.proto.greet.GreetRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.greeting_ = greetingBuilder_ == null
            ? greeting_
            : greetingBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.proto.greet.GreetRequest) {
        return mergeFrom((com.proto.greet.GreetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.greet.GreetRequest other) {
      if (other == com.proto.greet.GreetRequest.getDefaultInstance()) return this;
      if (other.hasGreeting()) {
        mergeGreeting(other.getGreeting());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getGreetingFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.proto.greet.Greeting greeting_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.greet.Greeting, com.proto.greet.Greeting.Builder, com.proto.greet.GreetingOrBuilder> greetingBuilder_;
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     * @return Whether the greeting field is set.
     */
    public boolean hasGreeting() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     * @return The greeting.
     */
    public com.proto.greet.Greeting getGreeting() {
      if (greetingBuilder_ == null) {
        return greeting_ == null ? com.proto.greet.Greeting.getDefaultInstance() : greeting_;
      } else {
        return greetingBuilder_.getMessage();
      }
    }
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     */
    public Builder setGreeting(com.proto.greet.Greeting value) {
      if (greetingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        greeting_ = value;
      } else {
        greetingBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     */
    public Builder setGreeting(
        com.proto.greet.Greeting.Builder builderForValue) {
      if (greetingBuilder_ == null) {
        greeting_ = builderForValue.build();
      } else {
        greetingBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     */
    public Builder mergeGreeting(com.proto.greet.Greeting value) {
      if (greetingBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          greeting_ != null &&
          greeting_ != com.proto.greet.Greeting.getDefaultInstance()) {
          getGreetingBuilder().mergeFrom(value);
        } else {
          greeting_ = value;
        }
      } else {
        greetingBuilder_.mergeFrom(value);
      }
      if (greeting_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     */
    public Builder clearGreeting() {
      bitField0_ = (bitField0_ & ~0x00000001);
      greeting_ = null;
      if (greetingBuilder_ != null) {
        greetingBuilder_.dispose();
        greetingBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     */
    public com.proto.greet.Greeting.Builder getGreetingBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getGreetingFieldBuilder().getBuilder();
    }
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     */
    public com.proto.greet.GreetingOrBuilder getGreetingOrBuilder() {
      if (greetingBuilder_ != null) {
        return greetingBuilder_.getMessageOrBuilder();
      } else {
        return greeting_ == null ?
            com.proto.greet.Greeting.getDefaultInstance() : greeting_;
      }
    }
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.greet.Greeting, com.proto.greet.Greeting.Builder, com.proto.greet.GreetingOrBuilder> 
        getGreetingFieldBuilder() {
      if (greetingBuilder_ == null) {
        greetingBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.proto.greet.Greeting, com.proto.greet.Greeting.Builder, com.proto.greet.GreetingOrBuilder>(
                getGreeting(),
                getParentForChildren(),
                isClean());
        greeting_ = null;
      }
      return greetingBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:greet.GreetRequest)
  }

  // @@protoc_insertion_point(class_scope:greet.GreetRequest)
  private static final com.proto.greet.GreetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.greet.GreetRequest();
  }

  public static com.proto.greet.GreetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GreetRequest>
      PARSER = new com.google.protobuf.AbstractParser<GreetRequest>() {
    @java.lang.Override
    public GreetRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<GreetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GreetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.greet.GreetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

