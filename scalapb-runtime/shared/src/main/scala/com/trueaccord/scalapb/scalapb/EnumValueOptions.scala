// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.trueaccord.scalapb.scalapb



/** @param extends
  *   Additional classes and traits to mix in to an individual enum value.
  */
@SerialVersionUID(0L)
final case class EnumValueOptions(
    `extends`: _root_.scala.collection.Seq[String] = _root_.scala.collection.Seq.empty
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[EnumValueOptions] with com.trueaccord.lenses.Updatable[EnumValueOptions] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      `extends`.foreach(`extends` => __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, `extends`))
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
      `extends`.foreach { __v =>
        _output__.writeString(1, __v)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.trueaccord.scalapb.scalapb.EnumValueOptions = {
      val __extends = (_root_.scala.collection.immutable.Vector.newBuilder[String] ++= this.`extends`)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __extends += _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      com.trueaccord.scalapb.scalapb.EnumValueOptions(
          `extends` = __extends.result()
      )
    }
    def clearExtends = copy(`extends` = _root_.scala.collection.Seq.empty)
    def addExtends(__vs: String*): EnumValueOptions = addAllExtends(__vs)
    def addAllExtends(__vs: TraversableOnce[String]): EnumValueOptions = copy(`extends` = `extends` ++ __vs)
    def withExtends(__v: _root_.scala.collection.Seq[String]): EnumValueOptions = copy(`extends` = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => `extends`
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(`extends`.map(_root_.scalapb.descriptors.PString)(_root_.scala.collection.breakOut))
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.trueaccord.scalapb.scalapb.EnumValueOptions
}

object EnumValueOptions extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.trueaccord.scalapb.scalapb.EnumValueOptions] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.trueaccord.scalapb.scalapb.EnumValueOptions] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.trueaccord.scalapb.scalapb.EnumValueOptions = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.trueaccord.scalapb.scalapb.EnumValueOptions(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.collection.Seq[String]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.trueaccord.scalapb.scalapb.EnumValueOptions] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.trueaccord.scalapb.scalapb.EnumValueOptions(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.collection.Seq[String]]).getOrElse(_root_.scala.collection.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ScalapbProto.javaDescriptor.getMessageTypes.get(4)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ScalapbProto.scalaDescriptor.messages(4)
  def messageCompanionForFieldNumber(__number: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.trueaccord.scalapb.scalapb.EnumValueOptions(
  )
  implicit class EnumValueOptionsLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.trueaccord.scalapb.scalapb.EnumValueOptions]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.trueaccord.scalapb.scalapb.EnumValueOptions](_l) {
    def `extends`: _root_.com.trueaccord.lenses.Lens[UpperPB, _root_.scala.collection.Seq[String]] = field(_.`extends`)((c_, f_) => c_.copy(`extends` = f_))
  }
  final val EXTENDS_FIELD_NUMBER = 1
}
