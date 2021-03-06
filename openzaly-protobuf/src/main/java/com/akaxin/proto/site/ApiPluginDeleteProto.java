// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: site/api_plugin_delete.proto

package com.akaxin.proto.site;

public final class ApiPluginDeleteProto {
  private ApiPluginDeleteProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ApiPluginDeleteRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiPluginDeleteRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *需要删除的插件ID
     * </pre>
     *
     * <code>optional string plugin_id = 1;</code>
     */
    java.lang.String getPluginId();
    /**
     * <pre>
     *需要删除的插件ID
     * </pre>
     *
     * <code>optional string plugin_id = 1;</code>
     */
    com.google.protobuf.ByteString
        getPluginIdBytes();
  }
  /**
   * Protobuf type {@code site.ApiPluginDeleteRequest}
   */
  public  static final class ApiPluginDeleteRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:site.ApiPluginDeleteRequest)
      ApiPluginDeleteRequestOrBuilder {
    // Use ApiPluginDeleteRequest.newBuilder() to construct.
    private ApiPluginDeleteRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ApiPluginDeleteRequest() {
      pluginId_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ApiPluginDeleteRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              pluginId_ = s;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akaxin.proto.site.ApiPluginDeleteProto.internal_static_site_ApiPluginDeleteRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akaxin.proto.site.ApiPluginDeleteProto.internal_static_site_ApiPluginDeleteRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest.class, com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest.Builder.class);
    }

    public static final int PLUGIN_ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object pluginId_;
    /**
     * <pre>
     *需要删除的插件ID
     * </pre>
     *
     * <code>optional string plugin_id = 1;</code>
     */
    public java.lang.String getPluginId() {
      java.lang.Object ref = pluginId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pluginId_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *需要删除的插件ID
     * </pre>
     *
     * <code>optional string plugin_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPluginIdBytes() {
      java.lang.Object ref = pluginId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pluginId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getPluginIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pluginId_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getPluginIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pluginId_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest)) {
        return super.equals(obj);
      }
      com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest other = (com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest) obj;

      boolean result = true;
      result = result && getPluginId()
          .equals(other.getPluginId());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + PLUGIN_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPluginId().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code site.ApiPluginDeleteRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiPluginDeleteRequest)
        com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.akaxin.proto.site.ApiPluginDeleteProto.internal_static_site_ApiPluginDeleteRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.akaxin.proto.site.ApiPluginDeleteProto.internal_static_site_ApiPluginDeleteRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest.class, com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest.Builder.class);
      }

      // Construct using com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest.newBuilder()
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
        }
      }
      public Builder clear() {
        super.clear();
        pluginId_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.akaxin.proto.site.ApiPluginDeleteProto.internal_static_site_ApiPluginDeleteRequest_descriptor;
      }

      public com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest getDefaultInstanceForType() {
        return com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest.getDefaultInstance();
      }

      public com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest build() {
        com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest buildPartial() {
        com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest result = new com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest(this);
        result.pluginId_ = pluginId_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest) {
          return mergeFrom((com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest other) {
        if (other == com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest.getDefaultInstance()) return this;
        if (!other.getPluginId().isEmpty()) {
          pluginId_ = other.pluginId_;
          onChanged();
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object pluginId_ = "";
      /**
       * <pre>
       *需要删除的插件ID
       * </pre>
       *
       * <code>optional string plugin_id = 1;</code>
       */
      public java.lang.String getPluginId() {
        java.lang.Object ref = pluginId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          pluginId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *需要删除的插件ID
       * </pre>
       *
       * <code>optional string plugin_id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getPluginIdBytes() {
        java.lang.Object ref = pluginId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          pluginId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *需要删除的插件ID
       * </pre>
       *
       * <code>optional string plugin_id = 1;</code>
       */
      public Builder setPluginId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        pluginId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *需要删除的插件ID
       * </pre>
       *
       * <code>optional string plugin_id = 1;</code>
       */
      public Builder clearPluginId() {
        
        pluginId_ = getDefaultInstance().getPluginId();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *需要删除的插件ID
       * </pre>
       *
       * <code>optional string plugin_id = 1;</code>
       */
      public Builder setPluginIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        pluginId_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:site.ApiPluginDeleteRequest)
    }

    // @@protoc_insertion_point(class_scope:site.ApiPluginDeleteRequest)
    private static final com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest();
    }

    public static com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ApiPluginDeleteRequest>
        PARSER = new com.google.protobuf.AbstractParser<ApiPluginDeleteRequest>() {
      public ApiPluginDeleteRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ApiPluginDeleteRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ApiPluginDeleteRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ApiPluginDeleteRequest> getParserForType() {
      return PARSER;
    }

    public com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ApiPluginDeleteResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiPluginDeleteResponse)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code site.ApiPluginDeleteResponse}
   */
  public  static final class ApiPluginDeleteResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:site.ApiPluginDeleteResponse)
      ApiPluginDeleteResponseOrBuilder {
    // Use ApiPluginDeleteResponse.newBuilder() to construct.
    private ApiPluginDeleteResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ApiPluginDeleteResponse() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ApiPluginDeleteResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akaxin.proto.site.ApiPluginDeleteProto.internal_static_site_ApiPluginDeleteResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akaxin.proto.site.ApiPluginDeleteProto.internal_static_site_ApiPluginDeleteResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse.class, com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse.Builder.class);
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse)) {
        return super.equals(obj);
      }
      com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse other = (com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse) obj;

      boolean result = true;
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code site.ApiPluginDeleteResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiPluginDeleteResponse)
        com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.akaxin.proto.site.ApiPluginDeleteProto.internal_static_site_ApiPluginDeleteResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.akaxin.proto.site.ApiPluginDeleteProto.internal_static_site_ApiPluginDeleteResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse.class, com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse.Builder.class);
      }

      // Construct using com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse.newBuilder()
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
        }
      }
      public Builder clear() {
        super.clear();
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.akaxin.proto.site.ApiPluginDeleteProto.internal_static_site_ApiPluginDeleteResponse_descriptor;
      }

      public com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse getDefaultInstanceForType() {
        return com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse.getDefaultInstance();
      }

      public com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse build() {
        com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse buildPartial() {
        com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse result = new com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse(this);
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse) {
          return mergeFrom((com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse other) {
        if (other == com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse.getDefaultInstance()) return this;
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:site.ApiPluginDeleteResponse)
    }

    // @@protoc_insertion_point(class_scope:site.ApiPluginDeleteResponse)
    private static final com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse();
    }

    public static com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ApiPluginDeleteResponse>
        PARSER = new com.google.protobuf.AbstractParser<ApiPluginDeleteResponse>() {
      public ApiPluginDeleteResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ApiPluginDeleteResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ApiPluginDeleteResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ApiPluginDeleteResponse> getParserForType() {
      return PARSER;
    }

    public com.akaxin.proto.site.ApiPluginDeleteProto.ApiPluginDeleteResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_site_ApiPluginDeleteRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_site_ApiPluginDeleteRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_site_ApiPluginDeleteResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_site_ApiPluginDeleteResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034site/api_plugin_delete.proto\022\004site\"+\n\026" +
      "ApiPluginDeleteRequest\022\021\n\tplugin_id\030\001 \001(" +
      "\t\"\031\n\027ApiPluginDeleteResponse2_\n\026ApiPlugi" +
      "nDeleteService\022E\n\006delete\022\034.site.ApiPlugi" +
      "nDeleteRequest\032\035.site.ApiPluginDeleteRes" +
      "ponseB-\n\025com.akaxin.proto.siteB\024ApiPlugi" +
      "nDeleteProtob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_site_ApiPluginDeleteRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_site_ApiPluginDeleteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_site_ApiPluginDeleteRequest_descriptor,
        new java.lang.String[] { "PluginId", });
    internal_static_site_ApiPluginDeleteResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_site_ApiPluginDeleteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_site_ApiPluginDeleteResponse_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
