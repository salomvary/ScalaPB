// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.source_context



/** `SourceContext` represents information about the source of a
  * protobuf element, like the file in which it is defined.
  *
  * @param fileName
  *   The path-qualified name of the .proto file that contained the associated
  *   protobuf element.  For example: `"google/protobuf/source_context.proto"`.
  */
@SerialVersionUID(0L)
final case class SourceContext(
    fileName: String = ""
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[SourceContext] with com.trueaccord.lenses.Updatable[SourceContext] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (fileName != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, fileName) }
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
      {
        val __v = fileName
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.source_context.SourceContext = {
      var __fileName = this.fileName
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __fileName = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.source_context.SourceContext(
          fileName = __fileName
      )
    }
    def withFileName(__v: String): SourceContext = copy(fileName = __v)
    def getField(__field: _root_.com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => {
          val __t = fileName
          if (__t != "") __t else null
        }
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.source_context.SourceContext
}

object SourceContext extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.source_context.SourceContext] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.source_context.SourceContext] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.source_context.SourceContext = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    com.google.protobuf.source_context.SourceContext(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[String]
    )
  }
  def descriptor: _root_.com.google.protobuf.Descriptors.Descriptor = SourceContextProto.descriptor.getMessageTypes.get(0)
  def messageCompanionForField(__field: _root_.com.google.protobuf.Descriptors.FieldDescriptor): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__field)
  def enumCompanionForField(__field: _root_.com.google.protobuf.Descriptors.FieldDescriptor): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = com.google.protobuf.source_context.SourceContext(
  )
  implicit class SourceContextLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.source_context.SourceContext]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.source_context.SourceContext](_l) {
    def fileName: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.fileName)((c_, f_) => c_.copy(fileName = f_))
  }
  final val FILE_NAME_FIELD_NUMBER = 1
}
