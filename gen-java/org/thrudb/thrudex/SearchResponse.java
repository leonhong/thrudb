/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.thrudb.thrudex;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;

public class SearchResponse implements TBase, java.io.Serializable, Cloneable, Comparable<SearchResponse> {
  private static final TStruct STRUCT_DESC = new TStruct("SearchResponse");
  private static final TField TOTAL_FIELD_DESC = new TField("total", TType.I32, (short)1);
  private static final TField ELEMENTS_FIELD_DESC = new TField("elements", TType.LIST, (short)2);
  private static final TField EX_FIELD_DESC = new TField("ex", TType.STRUCT, (short)3);

  public int total;
  public List<Element> elements;
  public ThrudexException ex;
  public static final int TOTAL = 1;
  public static final int ELEMENTS = 2;
  public static final int EX = 3;

  // isset id assignments
  private static final int __TOTAL_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new HashMap<Integer, FieldMetaData>() {{
    put(TOTAL, new FieldMetaData("total", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    put(ELEMENTS, new FieldMetaData("elements", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, Element.class))));
    put(EX, new FieldMetaData("ex", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRUCT)));
  }});

  static {
    FieldMetaData.addStructMetaDataMap(SearchResponse.class, metaDataMap);
  }

  public SearchResponse() {
    this.total = -1;

  }

  public SearchResponse(
    int total,
    List<Element> elements,
    ThrudexException ex)
  {
    this();
    this.total = total;
    setTotalIsSet(true);
    this.elements = elements;
    this.ex = ex;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SearchResponse(SearchResponse other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.total = other.total;
    if (other.isSetElements()) {
      List<Element> __this__elements = new ArrayList<Element>();
      for (Element other_element : other.elements) {
        __this__elements.add(new Element(other_element));
      }
      this.elements = __this__elements;
    }
    if (other.isSetEx()) {
      this.ex = new ThrudexException(other.ex);
    }
  }

  public SearchResponse deepCopy() {
    return new SearchResponse(this);
  }

  @Deprecated
  public SearchResponse clone() {
    return new SearchResponse(this);
  }

  public int getTotal() {
    return this.total;
  }

  public SearchResponse setTotal(int total) {
    this.total = total;
    setTotalIsSet(true);
    return this;
  }

  public void unsetTotal() {
    __isset_bit_vector.clear(__TOTAL_ISSET_ID);
  }

  // Returns true if field total is set (has been asigned a value) and false otherwise
  public boolean isSetTotal() {
    return __isset_bit_vector.get(__TOTAL_ISSET_ID);
  }

  public void setTotalIsSet(boolean value) {
    __isset_bit_vector.set(__TOTAL_ISSET_ID, value);
  }

  public List<Element> getElements() {
    return this.elements;
  }

  public SearchResponse setElements(List<Element> elements) {
    this.elements = elements;
    return this;
  }

  public void unsetElements() {
    this.elements = null;
  }

  // Returns true if field elements is set (has been asigned a value) and false otherwise
  public boolean isSetElements() {
    return this.elements != null;
  }

  public void setElementsIsSet(boolean value) {
    if (!value) {
      this.elements = null;
    }
  }

  public ThrudexException getEx() {
    return this.ex;
  }

  public SearchResponse setEx(ThrudexException ex) {
    this.ex = ex;
    return this;
  }

  public void unsetEx() {
    this.ex = null;
  }

  // Returns true if field ex is set (has been asigned a value) and false otherwise
  public boolean isSetEx() {
    return this.ex != null;
  }

  public void setExIsSet(boolean value) {
    if (!value) {
      this.ex = null;
    }
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case TOTAL:
      if (value == null) {
        unsetTotal();
      } else {
        setTotal((Integer)value);
      }
      break;

    case ELEMENTS:
      if (value == null) {
        unsetElements();
      } else {
        setElements((List<Element>)value);
      }
      break;

    case EX:
      if (value == null) {
        unsetEx();
      } else {
        setEx((ThrudexException)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case TOTAL:
      return new Integer(getTotal());

    case ELEMENTS:
      return getElements();

    case EX:
      return getEx();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case TOTAL:
      return isSetTotal();
    case ELEMENTS:
      return isSetElements();
    case EX:
      return isSetEx();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SearchResponse)
      return this.equals((SearchResponse)that);
    return false;
  }

  public boolean equals(SearchResponse that) {
    if (that == null)
      return false;

    boolean this_present_total = true;
    boolean that_present_total = true;
    if (this_present_total || that_present_total) {
      if (!(this_present_total && that_present_total))
        return false;
      if (this.total != that.total)
        return false;
    }

    boolean this_present_elements = true && this.isSetElements();
    boolean that_present_elements = true && that.isSetElements();
    if (this_present_elements || that_present_elements) {
      if (!(this_present_elements && that_present_elements))
        return false;
      if (!this.elements.equals(that.elements))
        return false;
    }

    boolean this_present_ex = true && this.isSetEx();
    boolean that_present_ex = true && that.isSetEx();
    if (this_present_ex || that_present_ex) {
      if (!(this_present_ex && that_present_ex))
        return false;
      if (!this.ex.equals(that.ex))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SearchResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SearchResponse typedOther = (SearchResponse)other;

    lastComparison = Boolean.valueOf(isSetTotal()).compareTo(isSetTotal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(total, typedOther.total);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetElements()).compareTo(isSetElements());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(elements, typedOther.elements);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetEx()).compareTo(isSetEx());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(ex, typedOther.ex);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case TOTAL:
          if (field.type == TType.I32) {
            this.total = iprot.readI32();
            setTotalIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case ELEMENTS:
          if (field.type == TType.LIST) {
            {
              TList _list9 = iprot.readListBegin();
              this.elements = new ArrayList<Element>(_list9.size);
              for (int _i10 = 0; _i10 < _list9.size; ++_i10)
              {
                Element _elem11;
                _elem11 = new Element();
                _elem11.read(iprot);
                this.elements.add(_elem11);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case EX:
          if (field.type == TType.STRUCT) {
            this.ex = new ThrudexException();
            this.ex.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(TOTAL_FIELD_DESC);
    oprot.writeI32(this.total);
    oprot.writeFieldEnd();
    if (this.elements != null) {
      oprot.writeFieldBegin(ELEMENTS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.elements.size()));
        for (Element _iter12 : this.elements)
        {
          _iter12.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.ex != null) {
      oprot.writeFieldBegin(EX_FIELD_DESC);
      this.ex.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SearchResponse(");
    boolean first = true;

    sb.append("total:");
    sb.append(this.total);
    first = false;
    if (!first) sb.append(", ");
    sb.append("elements:");
    if (this.elements == null) {
      sb.append("null");
    } else {
      sb.append(this.elements);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ex:");
    if (this.ex == null) {
      sb.append("null");
    } else {
      sb.append(this.ex);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

