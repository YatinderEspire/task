/*
 * Copyright (c) 2021 CEVA Logistics, Inc. All Rights Reserved.
 */

package org.example.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * WMSErrorCode.
 *
 * @author Raul Garnacho
 */
public enum WMSErrorCode {
  // ---- Request validation errors ----

  HEADER_MESSAGE_ID_LENGTH_EXCEEDED(
      "1000",
      "Message id " + Templates.MAX_LENGTH_THIRTY_FIVE
  ),
  HEADER_DATE_TIME_LENGTH_EXCEEDED(
      "1001",
      "Date " + Templates.MAX_LENGTH_FOURTEEN
  ),
  HEADER_MESSAGE_TYPE_NOT_NULL(
      "1002",
      "Message type " + Templates.NOT_NULL
  ),
  HEADER_MESSAGE_TYPE_LENGTH_EXCEEDED(
      "1003",
      "Message type " + Templates.MAX_LENGTH_SEVENTEEN
  ),
  HEADER_MESSAGE_VERSION_NOT_NULL(
      "1004",
      "Message version " + Templates.NOT_NULL
  ),
  HEADER_MESSAGE_VERSION_LENGTH_EXCEEDED(
      "1005",
      "Message version " + Templates.MAX_LENGTH_FOUR
  ),
  HEADER_SENDER_ID_NOT_NULL(
      "1006",
      "Sender id " + Templates.NOT_NULL
  ),
  HEADER_SENDER_ID_LENGTH_EXCEEDED(
      "1007",
      "Sender id " + Templates.MAX_LENGTH_THIRTY_FIVE
  ),
  HEADER_SITE_ID_LENGTH_EXCEEDED(
      "1008",
      "Site id " + Templates.MAX_LENGTH_TEN
  ),
  HEADER_CLIENT_ID_LENGTH_EXCEEDED(
      "1009",
      "Client id " + Templates.MAX_LENGTH_TEN
  ),
  HEADER_MESSAGE_REFERENCE_LENGTH_EXCEEDED(
      "1010",
      "Message reference " + Templates.MAX_LENGTH_THIRTY_FIVE
  ),
  HEADER_TRACE_ENABLED_LENGTH_EXCEEDED(
      "1011",
      "Trace enabled " + Templates.MAX_LENGTH_ONE
  ),
  HEADER_NOT_NULL(
      "1012",
      "Header " + Templates.NOT_NULL
  ),
  HEADER_MESSAGE_TYPE_UPPERCASE(
      "1013",
      "Header message type " + Templates.UPPERCASE
  ),
  HEADER_SITE_ID_UPPERCASE(
      "1014",
      "Header site id " + Templates.UPPERCASE
  ),
  HEADER_CLIENT_ID_UPPERCASE(
      "1015",
      "Header client id " + Templates.UPPERCASE
  ),


  MOVE_KEY_NEGATIVE(
      "2000",
      "Move Key " + Templates.POSITIVE
  ),
  MOVE_FROM_LOCATION_ID_NOT_NULL(
      "2001",
      "Move from location id " + Templates.NOT_NULL
  ),
  MOVE_FROM_LOCATION_ID_MAX_LENGTH_EXCEEDED(
      "2002",
      "Move from location id " + Templates.MAX_LENGTH_TWENTY
  ),
  MOVE_TO_LOCATION_ID_NOT_NULL(
      "2003",
      "Move to location id " + Templates.NOT_NULL
  ),
  MOVE_TO_LOCATION_ID_MAX_LENGTH_EXCEEDED(
      "2004",
      "Move to location id " + Templates.MAX_LENGTH_TWENTY
  ),
  MOVE_PALLET_ID_NOT_NULL(
      "2005",
      "Move pallet id " + Templates.NOT_NULL
  ),
  MOVE_PALLET_ID_MAX_LENGTH_EXCEEDED(
      "2006",
      "Move pallet id " + Templates.MAX_LENGTH_TWENTY
  ),
  MOVE_TAG_ID_NOT_NULL(
      "2007",
      "Move tag id " + Templates.NOT_NULL
  ),
  MOVE_TAG_ID_MAX_LENGTH_EXCEEDED(
      "2008",
      "Move tag id " + Templates.MAX_LENGTH_TWENTY
  ),
  MOVE_SKU_ID_NOT_NULL(
      "2009",
      "Move sku id " + Templates.NOT_NULL
  ),
  MOVE_SKU_ID_MAX_LENGTH_EXCEEDED(
      "2010",
      "Move sku id " + Templates.MAX_LENGTH_FIFTY
  ),
  MOVE_OWNER_ID_NOT_NULL(
      "2011",
      "Move owner id " + Templates.NOT_NULL
  ),
  MOVE_OWNER_ID_MAX_LENGTH_EXCEEDED(
      "2012",
      "Move owner id " + Templates.MAX_LENGTH_TEN
  ),
  MOVE_REASON_ID_MAX_LENGTH_EXCEEDED(
      "2013",
      "Move reason id " + Templates.MAX_LENGTH_TEN
  ),
  MOVE_IDENTIFIER1_INCOMPLETE(
      "2014",
      "Identifier1 is incomplete " + Templates.IDENTIFIER_INCOMPLETE
  ),
  MOVE_IDENTIFIER2_INCOMPLETE(
      "2015",
      "Identifier2 is incomplete " + Templates.IDENTIFIER_INCOMPLETE
  ),
  MOVE_IDENTIFIER3_INCOMPLETE(
      "2016",
      "Identifier3 is incomplete " + Templates.IDENTIFIER_INCOMPLETE
  ),
  MOVE_REASON_ID_INVALID_VALUE(
      "2017",
      "Move reason id must be one of the values: [EX_DS, EX_OR, EX_NE, EX_SP]"
  ),
  MOVE_SERIAL_NUMBER_MAX_LENGTH_EXCEEDED(
      "2018",
      "Move serial number " + Templates.MAX_LENGTH_THIRTY
  ),
  MOVE_DETAILS_LIST_NOT_NULL(
      "2019",
      "Move details list " + Templates.NOT_NULL
  ),
  MOVE_DETAILS_LIST_NOT_EMPTY(
      "2020",
      "Move details list " + Templates.NOT_EMPTY
  ),
  MOVE_FROM_LOCATION_ID_UPPERCASE(
      "2021",
      "Move from location id " + Templates.UPPERCASE
  ),
  MOVE_TO_LOCATION_ID_UPPERCASE(
      "2022",
      "Move to location id " + Templates.UPPERCASE
  ),
  MOVE_QTY_FORMAT(
      "2023",
      "Move quantity " + Templates.DECIMAL_9_6
  ),
  MOVE_IDENTIFIER1_MAX_LENGTH_EXCEEDED(
      "2024",
      "Move identifier1 " + Templates.MAX_LENGTH_THIRTY
  ),
  MOVE_IDENTIFIER2_MAX_LENGTH_EXCEEDED(
      "2025",
      "Move identifier2 " + Templates.MAX_LENGTH_THIRTY
  ),
  MOVE_IDENTIFIER3_MAX_LENGTH_EXCEEDED(
      "2026",
      "Move identifier3 " + Templates.MAX_LENGTH_THIRTY
  ),
  MOVE_SKU_ID_UPPERCASE(
      "2027",
      "Move sku id " + Templates.UPPERCASE
  ),
  MOVE_REASON_ID_UPPERCASE(
      "2028",
      "Move reason id " + Templates.UPPERCASE
  ),
  MOVE_IDENTIFIER1_UPPERCASE(
      "2029",
      "Move Identifier1 " + Templates.UPPERCASE
  ),
  MOVE_IDENTIFIER2_UPPERCASE(
      "2030",
      "Move Identifier2 " + Templates.UPPERCASE
  ),
  MOVE_IDENTIFIER3_UPPERCASE(
      "2031",
      "Move Identifier3 " + Templates.UPPERCASE
  ),
  MOVE_OWNER_ID_ALPHANUMERIC(
      "2032",
      "Move owner id " + Templates.ALPHANUMERIC    
  ),
  MOVE_TYPE1_INVALID_VALUE(
      "2033",
      "Move Type1 id " + Templates.TYPE_VALUES
  ),
  MOVE_TYPE2_INVALID_VALUE(
      "2034",
      "Move Type2 id " + Templates.TYPE_VALUES
  ),
  MOVE_TYPE3_INVALID_VALUE(
      "2035",
      "Move Type3 id " + Templates.TYPE_VALUES
  ),
  MOVE_KEY_FORMAT(
      "2036",
      "Move key " + Templates.INTEGER_10
  ),
 
  
  PICK_PALLET_NOT_NULL(
      "3000",
      "Pick pallet " + Templates.NOT_NULL
  ),
  PICK_PALLET_ID_LENGTH_EXCEEDED(
      "3001",
      "Pick pallet id " + Templates.MAX_LENGTH_TWENTY
  ),
  PICK_PALLET_ID_UPPERCASE(
      "3002",
      "Pick pallet id " + Templates.UPPERCASE
  ),
  PICK_PALLET_TYPE_LENGTH_EXCEEDED(
      "3003",
      "Pick pallet type " + Templates.MAX_LENGTH_FIFTEEN
  ),
  PICK_PALLET_TYPE_UPPERCASE(
      "3004",
      "Pick pallet type " + Templates.UPPERCASE
  ),
  PICK_CONTAINER_ID_LENGTH_EXCEEDED(
      "3005",
      "Pick pallet container id " + Templates.MAX_LENGTH_TWENTY
  ),
  PICK_CONTAINER_ID_UPPERCASE(
      "3006",
      "Pick pallet container id " + Templates.UPPERCASE
  ),
  PICK_CONTAINER_TYPE_LENGTH_EXCEEDED(
      "3007",
      "Pick pallet container type " + Templates.MAX_LENGTH_FIFTEEN
  ),
  PICK_CONTAINER_TYPE_UPPERCASE(
      "3008",
      "Pick pallet container type " + Templates.UPPERCASE
  ),
  PICK_KEY_FORMAT(
      "3009",
      "Pick key " + Templates.INTEGER_10
  ),
  PICK_KEY_NEGATIVE(
      "3010",
      "Pick key " + Templates.POSITIVE
  ),
  PICK_ORDER_ID_NOT_NULL(
      "3011",
      "Pick order id " + Templates.NOT_NULL
  ),
  PICK_ORDER_ID_LENGTH_EXCEEDED(
      "3012",
      "Pick order id " + Templates.MAX_LENGTH_TWENTY
  ),
  PICK_ORDER_ID_UPPERCASE(
      "3013",
      "Pick order id " + Templates.UPPERCASE
  ),
  PICK_LINE_ID_NOT_NULL(
      "3014",
      "Pick line id " + Templates.NOT_NULL
  ),
  PICK_LINE_ID_FORMAT(
      "3015",
      "Pick line id " + Templates.INTEGER_6
  ),
  PICK_LINE_ID_NEGATIVE(
      "3016",
      "Pick line id " + Templates.POSITIVE
  ),
  PICK_SKU_ID_NOT_NULL(
      "3017",
      "Pick SKU id " + Templates.NOT_NULL
  ),
  PICK_SKU_ID_LENGTH_EXCEEDED(
      "3018",
      "Pick SKU id " + Templates.MAX_LENGTH_FIFTY
  ),
  PICK_SKU_ID_UPPERCASE(
      "3019",
      "Pick SKU id " + Templates.UPPERCASE
  ),
  PICK_OWNER_ID_LENGTH_EXCEEDED(
      "3020",
      "Pick owner id " + Templates.MAX_LENGTH_TEN
  ),
  PICK_OWNER_ID_UPPERCASE(
      "3021",
      "Pick owner id " + Templates.UPPERCASE
  ),
  PICK_QTY_NOT_NULL(
      "3022",
      "Pick quantity " + Templates.NOT_NULL
  ),
  PICK_QTY_FORMAT(
      "3023",
      "Pick quantity " + Templates.DECIMAL_9_6
  ),
  PICK_TRACKING_LEVEL_LENGTH_EXCEEDED(
      "3024",
      "Pick tracking level " + Templates.MAX_LENGTH_EIGHT
  ),
  PICK_TRACKING_LEVEL_UPPERCASE(
      "3025",
      "Pick tracking level " + Templates.UPPERCASE
  ),
  PICK_TAG_ID_LENGTH_EXCEEDED(
      "3026",
      "Pick tag id " + Templates.MAX_LENGTH_TWENTY
  ),
  PICK_TAG_ID_UPPERCASE(
      "3027",
      "Pick tag id " + Templates.UPPERCASE
  ),
  PICK_FROM_LOCATION_ID_LENGTH_EXCEEDED(
      "3028",
      "Pick from location id " + Templates.MAX_LENGTH_TWENTY
  ),
  PICK_FROM_LOCATION_ID_UPPERCASE(
      "3029",
      "Pick from location id " + Templates.UPPERCASE
  ),
  PICK_REASON_ID_INVALID_VALUE(
      "3030",
      "Pick reason id must be one of the values: [EX_DS, EX_OR, EX_NE, EX_SP]"
  ),
  PICK_DETAILS_NOT_NULL(
      "3031",
      "Pick details " + Templates.NOT_NULL
  ),  
  PICK_QTY_NUMERIC(
      "3032",
      "Pick quantity " + Templates.NUMERIC
  ),
  PICK_REASON_ID_UPPERCASE(
      "3033",
      "Pick reason id " + Templates.UPPERCASE
  ),
  PICK_CONTAINERS_LIST_NOT_NULL(
      "3034",
      "Pick container list " + Templates.NOT_NULL
  ),
  PICK_CONTAINERS_LIST_NOT_EMPTY(
      "3035",
      "Pick container list " + Templates.NOT_EMPTY
  ),
  PICK_DETAILS_LIST_NOT_NULL(
      "3036",
      "Pick details list " + Templates.NOT_NULL
  ),
  PICK_DETAILS_LIST_NOT_EMPTY(
      "3037",
      "Pick details list " + Templates.NOT_EMPTY
  ),
  PICK_QUANTITY_FORMAT(
      "3038",
      "Pick quantity " + Templates.DECIMAL_9_6
  ),


  RECEIPT_DETAIL_NOT_NULL(
      "4000",
      "Receipt details " + Templates.NOT_NULL
  ),
  RECEIPT_OWNER_ID_NOT_NULL(
      "4001",
      "Receipt owner id " + Templates.NOT_NULL
  ),
  RECEIPT_OWNER_ID_LENGTH_EXCEEDED(
      "4002",
      "Receipt owner id " + Templates.MAX_LENGTH_TEN
  ),
  RECEIPT_OWNER_ID_UPPERCASE(
      "4003",
      "Receipt owner id " + Templates.UPPERCASE
  ),
  RECEIPT_RECEIPT_ID_NOT_NULL(
      "4004",
      "Receipt receipt id " + Templates.NOT_NULL
  ),
  RECEIPT_RECEIPT_ID_LENGTH_EXCEEDED(
      "4005",
      "Receipt receipt id " + Templates.MAX_LENGTH_TWENTY
  ),
  RECEIPT_RECEIPT_ID_UPPERCASE(
      "4006",
      "Receipt receipt id " + Templates.UPPERCASE
  ),
  RECEIPT_LINE_ID_NOT_NULL(
      "4007",
      "Receipt line id " + Templates.NOT_NULL
  ),
  RECEIPT_LINE_ID_NEGATIVE(
      "4008",
      "Receipt line id " + Templates.POSITIVE
  ),
  RECEIPT_LINE_ID_FORMAT(
      "4009",
      "Receipt line id " + Templates.INTEGER_6
  ),
  RECEIPT_SKU_ID_NOT_NULL(
      "4010",
      "Receipt sku id " + Templates.NOT_NULL
  ),
  RECEIPT_SKU_ID_LENGTH_EXCEEDED(
      "4011",
      "Receipt sku id " + Templates.MAX_LENGTH_FIFTY
  ),
  RECEIPT_SKU_ID_UPPERCASE(
      "4012",
      "Receipt sku id " + Templates.UPPERCASE
  ),
  RECEIPT_QTY_ON_HAND_NOT_NULL(
      "4013",
      "Receipt quantity on hand " + Templates.NOT_NULL
  ),
  RECEIPT_CONFIG_ID_NOT_NULL(
      "4014",
      "Receipt config id " + Templates.NOT_NULL
  ),
  RECEIPT_CONFIG_ID_LENGTH_EXCEEDED(
      "4015",
      "Receipt config id" + Templates.MAX_LENGTH_FIFTEEN
  ),
  RECEIPT_CONFIG_ID_UPPERCASE(
      "4016",
      "Receipt config id " + Templates.UPPERCASE
  ),
  RECEIPT_TAG_ID_NOT_NULL(
      "4017",
      "Receipt tag id " + Templates.NOT_NULL
  ),
  RECEIPT_TAG_ID_LENGTH_EXCEEDED(
      "4018",
      "Receipt tag id " + Templates.MAX_LENGTH_TWENTY
  ),
  RECEIPT_TAG_ID_UPPERCASE(
      "4019",
      "Receipt tag id " + Templates.UPPERCASE
  ),
  RECEIPT_BATCH_ID_LENGTH_EXCEEDED(
      "4020",
      "Receipt batch id " + Templates.MAX_LENGTH_FIFTEEN
  ),
  RECEIPT_BATCH_ID_UPPERCASE(
      "4021",
      "Receipt batch id " + Templates.UPPERCASE
  ),
  RECEIPT_LOCATION_ID_NOT_NULL(
      "4022",
      "Receipt location id " + Templates.NOT_NULL
  ),
  RECEIPT_LOCATION_ID_LENGTH_EXCEEDED(
      "4023",
      "Receipt location id " + Templates.MAX_LENGTH_TWENTY
  ),
  RECEIPT_LOCATION_ID_UPPERCASE(
      "4024",
      "Receipt location id " + Templates.UPPERCASE
  ),
  RECEIPT_CONDITION_ID_LENGTH_EXCEEDED(
      "4025",
      "Receipt condition id " + Templates.MAX_LENGTH_TEN
  ),
  RECEIPT_CONDITION_ID_UPPERCASE(
      "4026",
      "Receipt condition id " + Templates.UPPERCASE
  ),
  RECEIPT_EXPIRY_D_STAMP_LENGTH_EXCEEDED(
      "4027",
      "Receipt expiry date stamp " + Templates.MAX_LENGTH_FOURTEEN
  ),
  RECEIPT_MANUF_D_STAMP_LENGTH_EXCEEDED(
      "4028",
      "Receipt manufacture date stamp " + Templates.MAX_LENGTH_FOURTEEN
  ),
  RECEIPT_SUPPLIER_ID_NOT_NULL(
      "4029",
      "Receipt supplier id " + Templates.NOT_NULL
  ),
  RECEIPT_SUPPLIER_ID_LENGTH_EXCEEDED(
      "4030",
      "Receipt supplier id " + Templates.MAX_LENGTH_FIFTEEN
  ),
  RECEIPT_SUPPLIER_ID_UPPERCASE(
      "4031",
      "Receipt supplier id " + Templates.UPPERCASE
  ),
  RECEIPT_ORIGIN_ID_LENGTH_EXCEEDED(
      "4032",
      "Receipt origin id " + Templates.MAX_LENGTH_TEN
  ),
  RECEIPT_ORIGIN_ID_UPPERCASE(
      "4033",
      "Receipt origin id " + Templates.UPPERCASE
  ),
  RECEIPT_LOCK_CODE_LENGTH_EXCEEDED(
      "4034",
      "Receipt lock code " + Templates.MAX_LENGTH_TEN
  ),
  RECEIPT_LOCK_CODE_UPPERCASE(
      "4035",
      "Receipt lock code " + Templates.UPPERCASE
  ),  
  RECEIPT_D_STAMP_LENGTH_EXCEEDED(
      "4037",
      "Receipt date stamp " + Templates.MAX_LENGTH_FOURTEEN
  ),
  RECEIPT_SAMPLING_TYPE_LENGTH_EXCEEDED(
      "4038",
      "Receipt sampling type " + Templates.MAX_LENGTH_TWENTY
  ),
  RECEIPT_SAMPLING_TYPE_UPPERCASE(
      "4039",
      "Receipt sampling type " + Templates.UPPERCASE
  ),
  RECEIPT_CLIENT_GROUP_LENGTH_EXCEEDED(
      "4040",
      "Receipt client group " + Templates.MAX_LENGTH_TEN
  ),
  RECEIPT_CLIENT_GROUP_UPPERCASE(
      "4041",
      "Receipt client group " + Templates.UPPERCASE
  ),
  RECEIPT_TRACKING_LEVEL_LENGTH_EXCEEDED(
      "4042",
      "Receipt tracking level " + Templates.MAX_LENGTH_EIGHT
  ),
  RECEIPT_TRACKING_LEVEL_UPPERCASE(
      "4043",
      "Receipt tracking level " + Templates.UPPERCASE
  ),
  RECEIPT_SPEC_CODE_LENGTH_EXCEEDED(
      "4044",
      "Receipt spec code " + Templates.MAX_LENGTH_NINETY_NINE
  ),
  RECEIPT_SPEC_CODE_UPPERCASE(
      "4045",
      "Receipt spec code " + Templates.UPPERCASE
  ),
  RECEIPT_NOTES_LENGTH_EXCEEDED(
      "4046",
      "Receipt notes " + Templates.MAX_LENGTH_EIGHTY
  ),
  RECEIPT_PALLET_NOT_NULL(
      "4047",
      "Receipt pallet " + Templates.NOT_NULL
  ),
  RECEIPT_PALLET_ID_NOT_NULL(
      "4048",
      "Receipt pallet id " + Templates.NOT_NULL
  ),
  RECEIPT_PALLET_ID_LENGTH_EXCEEDED(
      "4049",
      "Receipt pallet id " + Templates.MAX_LENGTH_TWENTY
  ),
  RECEIPT_PALLET_ID_UPPERCASE(
      "4050",
      "Receipt pallet id " + Templates.UPPERCASE
  ),
  RECEIPT_PALLET_CONFIG_NOT_NULL(
      "4051",
      "Receipt pallet config " + Templates.NOT_NULL
  ),
  RECEIPT_PALLET_CONFIG_LENGTH_EXCEEDED(
      "4052",
      "Receipt pallet config " + Templates.MAX_LENGTH_FIFTEEN
  ),
  RECEIPT_PALLET_CONFIG_UPPERCASE(
      "4053",
      "Receipt pallet config " + Templates.UPPERCASE
  ),
  RECEIPT_PALLET_GROUPED_LENGTH_EXCEEDED(
      "4054",
      "Receipt pallet grouped " + Templates.MAX_LENGTH_ONE
  ),
  RECEIPT_PALLET_GROUPED_UPPERCASE(
      "4055",
      "Receipt pallet grouped " + Templates.UPPERCASE
  ),
  RECEIPT_USER_DEFINED_DATA_NOT_NULL(
      "4056",
      "Receipt user defined data " + Templates.NOT_NULL
  ),
  RECEIPT_USER_DEFINED_TYPE1_LENGTH_EXCEEDED(
      "4057",
      "Receipt user defined type 1 " + Templates.MAX_LENGTH_THIRTY
  ),
  RECEIPT_USER_DEFINED_TYPE2_LENGTH_EXCEEDED(
      "4058",
      "Receipt user defined type 2 " + Templates.MAX_LENGTH_THIRTY
  ),
  RECEIPT_USER_DEFINED_TYPE3_LENGTH_EXCEEDED(
      "4059",
      "Receipt user defined type 3 " + Templates.MAX_LENGTH_THIRTY
  ),
  RECEIPT_USER_DEFINED_TYPE4_LENGTH_EXCEEDED(
      "4060",
      "Receipt user defined type 4 " + Templates.MAX_LENGTH_THIRTY
  ),
  RECEIPT_USER_DEFINED_TYPE5_LENGTH_EXCEEDED(
      "4061",
      "Receipt user defined type 5 " + Templates.MAX_LENGTH_THIRTY
  ),
  RECEIPT_USER_DEFINED_TYPE6_LENGTH_EXCEEDED(
      "4062",
      "Receipt user defined type 6 " + Templates.MAX_LENGTH_THIRTY
  ),
  RECEIPT_USER_DEFINED_TYPE7_LENGTH_EXCEEDED(
      "4063",
      "Receipt user defined type 7 " + Templates.MAX_LENGTH_THIRTY
  ),
  RECEIPT_USER_DEFINED_TYPE8_LENGTH_EXCEEDED(
      "4064",
      "Receipt user defined type 8 " + Templates.MAX_LENGTH_THIRTY
  ),  
  RECEIPT_USER_DEFINED_TYPE1_UPPERCASE(
      "4065",
      "Receipt user defined type 1 " + Templates.UPPERCASE
  ),
  RECEIPT_USER_DEFINED_TYPE2_UPPERCASE(
      "4066",
      "Receipt user defined type 2 " + Templates.UPPERCASE
  ),
  RECEIPT_USER_DEFINED_TYPE3_UPPERCASE(
      "4067",
      "Receipt user defined type 3 " + Templates.UPPERCASE
  ),
  RECEIPT_USER_DEFINED_TYPE4_UPPERCASE(
      "4068",
      "Receipt user defined type 4 " + Templates.UPPERCASE
  ),
  RECEIPT_USER_DEFINED_TYPE5_UPPERCASE(
      "4069",
      "Receipt user defined type 5 " + Templates.UPPERCASE
  ),
  RECEIPT_USER_DEFINED_TYPE6_UPPERCASE(
      "4070",
      "Receipt user defined type 6 " + Templates.UPPERCASE
  ),
  RECEIPT_USER_DEFINED_TYPE7_UPPERCASE(
      "4071",
      "Receipt user defined type 7 " + Templates.UPPERCASE
  ),
  RECEIPT_USER_DEFINED_TYPE8_UPPERCASE(
      "4072",
      "Receipt user defined type 8 " + Templates.UPPERCASE
  ),
  RECEIPT_USER_DEFINED_CHECK1_LENGTH_EXCEEDED(
      "4073",
      "Receipt user defined check 1 " + Templates.MAX_LENGTH_ONE
  ),
  RECEIPT_USER_DEFINED_CHECK2_LENGTH_EXCEEDED(
      "4074",
      "Receipt user defined check 2 " + Templates.MAX_LENGTH_ONE
  ),
  RECEIPT_USER_DEFINED_CHECK3_LENGTH_EXCEEDED(
      "4075",
      "Receipt user defined check 3 " + Templates.MAX_LENGTH_ONE
  ),
  RECEIPT_USER_DEFINED_CHECK4_LENGTH_EXCEEDED(
      "4076",
      "Receipt user defined check 4 " + Templates.MAX_LENGTH_ONE
  ),
  RECEIPT_USER_DEFINED_CHECK1_UPPERCASE(
      "4077",
      "Receipt user defined check 1 " + Templates.UPPERCASE
  ),
  RECEIPT_USER_DEFINED_CHECK2_UPPERCASE(
      "4078",
      "Receipt user defined check 2 " + Templates.UPPERCASE
  ),
  RECEIPT_USER_DEFINED_CHECK3_UPPERCASE(
      "4079",
      "Receipt user defined check 3 " + Templates.UPPERCASE
  ),
  RECEIPT_USER_DEFINED_CHECK4_UPPERCASE(
      "4080",
      "Receipt user defined check 4 " + Templates.UPPERCASE
  ),
  RECEIPT_USER_DEFINED_DATE1_LENGTH_EXCEEDED(
      "4081",
      "Receipt user defined date 1 " + Templates.MAX_LENGTH_FOURTEEN
  ),
  RECEIPT_USER_DEFINED_DATE2_LENGTH_EXCEEDED(
      "4082",
      "Receipt user defined date 2 " + Templates.MAX_LENGTH_FOURTEEN
  ),
  RECEIPT_USER_DEFINED_DATE3_LENGTH_EXCEEDED(
      "4083",
      "Receipt user defined date 3 " + Templates.MAX_LENGTH_FOURTEEN
  ),
  RECEIPT_USER_DEFINED_DATE4_LENGTH_EXCEEDED(
      "4084",
      "Receipt user defined date 4 " + Templates.MAX_LENGTH_FOURTEEN
  ),
  RECEIPT_USER_DEFINED_NOTE1_LENGTH_EXCEEDED(
      "4085",
      "Receipt user defined note 1 " + Templates.MAX_LENGTH_TWO_HUNDRED
  ),
  RECEIPT_USER_DEFINED_NOTE2_LENGTH_EXCEEDED(
      "4086",
      "Receipt user defined note 2 " + Templates.MAX_LENGTH_TWO_HUNDRED
    ),
  RECEIPT_CUSTOMS_EXCISE_DATA_NOT_NULL(
      "4087",
      "Receipt customs excise data " + Templates.NOT_NULL
  ),
  RECEIPT_CE_CONSIGNMENT_ID_LENGTH_EXCEEDED(
      "4088",
      "Receipt ce consignment id " + Templates.MAX_LENGTH_EIGHTEEN
  ),
  RECEIPT_CE_CONSIGNMENT_ID_UPPERCASE(
      "4089",
      "Receipt ce consignment id " + Templates.UPPERCASE
  ),
  RECEIPT_CE_RECEIPT_TYPE_LENGTH_EXCEEDED(
      "4090",
      "Receipt ce receipt type " + Templates.MAX_LENGTH_TWO
  ),
  RECEIPT_CE_RECEIPT_TYPE_UPPERCASE(
      "4091",
      "Receipt ce receipt type " + Templates.UPPERCASE
  ),
  RECEIPT_CE_ORIGINATOR_LENGTH_EXCEEDED(
      "4092",
      "Receipt ce originator " + Templates.MAX_LENGTH_TWENTY_FIVE
  ),
  RECEIPT_CE_ORIGINATOR_UPPERCASE(
      "4093",
      "Receipt ce originator " + Templates.UPPERCASE
  ),
  RECEIPT_CE_ORIGINATOR_REF_LENGTH_EXCEEDED(
      "4094",
      "Receipt ce originator ref " + Templates.MAX_LENGTH_TWENTY_FIVE
  ),
  RECEIPT_CE_ORIGINATOR_REF_UPPERCASE(
      "4095",
      "Receipt ce originator ref " + Templates.UPPERCASE
  ),
  RECEIPT_CE_COO_LENGTH_EXCEEDED(
      "4096",
      "Receipt ce coo " + Templates.MAX_LENGTH_THREE
  ),
  RECEIPT_CE_COO_UPPERCASE(
      "4097",
      "Receipt ce coo " + Templates.UPPERCASE
  ),
  RECEIPT_CE_CWC_LENGTH_EXCEEDED(
      "4098",
      "Receipt ce cwc " + Templates.MAX_LENGTH_THREE
  ),
  RECEIPT_CE_CWC_UPPERCASE(
      "4099",
      "Receipt ce cwc " + Templates.UPPERCASE
  ),
  RECEIPT_CE_UCR_LENGTH_EXCEEDED(
      "4100",
      "Receipt ce ucr " + Templates.MAX_LENGTH_TWENTY
  ),
  RECEIPT_CE_UCR_UPPERCASE(
      "4101",
      "Receipt ce ucr " + Templates.UPPERCASE
  ),
  RECEIPT_CE_UNDER_BOND_LENGTH_EXCEEDED(
      "4102",
      "Receipt ce under bond " + Templates.MAX_LENGTH_ONE
  ),
  RECEIPT_CE_UNDER_BOND_UPPERCASE(
      "4103",
      "Receipt ce under bond " + Templates.UPPERCASE
  ),
  RECEIPT_CE_DUTY_STAMP_LENGTH_EXCEEDED(
      "4104",
      "Receipt ce duty stamp " + Templates.MAX_LENGTH_ONE
  ),
  RECEIPT_CE_DUTY_STAMP_UPPERCASE(
      "4105",
      "Receipt ce duty stamp " + Templates.UPPERCASE
  ),
  RECEIPT_CE_DOCUMENT_D_STAMP_LENGTH_EXCEEDED(
      "4106",
      "Receipt ce document date stamp "  + Templates.MAX_LENGTH_FOURTEEN
  ),
  RECEIPT_SERIAL_NUMBER_LENGTH_EXCEEDED(
      "4107",
      "Serial number "  + Templates.MAX_LENGTH_THIRTY
  ),
  RECEIPT_DETAIL_LIST_NOT_NULL(
      "4108",
      "Receipt details list " + Templates.NOT_NULL
  ),
  RECEIPT_DETAIL_LIST_NOT_EMPTY(
      "4109",
      "Receipt details list " + Templates.NOT_EMPTY
  ),
  RECEIPT_USER_DEFINED_NUM1_FORMAT(
      "4110",
      "Receipt user defined number 1 " + Templates.DECIMAL_9_6
  ),
  RECEIPT_USER_DEFINED_NUM2_FORMAT(
      "4111",
      "Receipt user defined number 2 " + Templates.DECIMAL_9_6
  ),
  RECEIPT_USER_DEFINED_NUM3_FORMAT(
      "4112",
      "Receipt user defined number 3 " + Templates.DECIMAL_9_6
  ),
  RECEIPT_USER_DEFINED_NUM4_FORMAT(
      "4113",
      "Receipt user defined number 4 " + Templates.DECIMAL_9_6
  ),
  RECEIPT_PALLET_VOLUME_FORMAT(
      "4114",
      "Receipt pallet volume " + Templates.DECIMAL_7_6
  ),
  RECEIPT_PALLET_HEIGHT_FORMAT(
      "4115",
      "Receipt pallet height " + Templates.DECIMAL_9_6
  ),
  RECEIPT_PALLET_DEPTH_FORMAT(
      "4116",
      "Receipt pallet depth " + Templates.DECIMAL_4_3
  ),
  RECEIPT_PALLET_WIDTH_FORMAT(
      "4117",
      "Receipt pallet width " + Templates.DECIMAL_4_3
  ),
  RECEIPT_PALLET_WEIGHT_FORMAT(
      "4118",
      "Receipt pallet weight " + Templates.DECIMAL_7_6
  ),
  RECEIPT_QTY_ON_HAND_FORMAT(
      "4119",
      "Receipt quantity on hand " + Templates.DECIMAL_9_6
  ),
  RECEIPT_TAG_COPIES_FORMAT(
      "4120",
      "Receipt tag copies " + Templates.INTEGER_2
  ),

  REPACK_CONTAINER_NOT_NULL(
      "5000",
      "Repack container " + Templates.NOT_NULL
  ),
  REPACK_CONTAINER_ID_NOT_NULL(
      "5001",
      "Repack container id "  + Templates.NOT_NULL
  ),
  REPACK_CONTAINER_ID_LENGTH_EXCEEDED(
      "5002",
      "Repack container id "  + Templates.MAX_LENGTH_TWENTY
  ),
  REPACK_CONTAINER_ID_UPPERCASE(
      "5003",
      "Repack container id "  + Templates.UPPERCASE
  ),
  REPACK_CONTAINER_TYPE_LENGTH_EXCEEDED(
      "5004",
      "Repack container type "  + Templates.MAX_LENGTH_FIFTEEN
  ),
  REPACK_CONTAINER_TYPE_UPPERCASE(
      "5005",
      "Repack container type "  + Templates.UPPERCASE
  ),
  REPACK_CONTAINER_STATUS_LENGTH_EXCEEDED(
      "5006",
      "Repack container status "  + Templates.MAX_LENGTH_FIFTEEN
  ),
  REPACK_CONTAINER_LOCATION_ID_LENGTH_EXCEEDED(
      "5007",
      "Repack container location id "  + Templates.MAX_LENGTH_TWENTY
  ),
  REPACK_CONTAINER_LOCATION_ID_UPPERCASE(
      "5008",
      "Repack container location id "  + Templates.UPPERCASE
  ),
  REPACK_DETAILS_NOT_NULL(
      "5009",
      "Repack details " + Templates.NOT_NULL
  ),
  REPACK_ORDER_ID_NOT_NULL(
      "5010",
      "Repack order id " + Templates.NOT_NULL
  ),
  REPACK_ORDER_ID_LENGTH_EXCEEDED(
      "5011",
      "Repack order id "  + Templates.MAX_LENGTH_TWENTY
  ),
  REPACK_ORDER_ID_UPPERCASE(
      "5012",
      "Repack order id "  + Templates.UPPERCASE
  ),
  REPACK_SKU_ID_NOT_NULL(
      "5013",
      "Repack sku id " + Templates.NOT_NULL
  ),
  REPACK_SKU_ID_LENGTH_EXCEEDED(
      "5014",
      "Repack sku id "  + Templates.MAX_LENGTH_FIFTY
  ),
  REPACK_SKU_ID_UPPERCASE(
      "5015",
      "Repack sku id "  + Templates.UPPERCASE
  ),
  REPACK_OWNER_ID_LENGTH_EXCEEDED(
      "5016",
      "Repack owner id "  + Templates.MAX_LENGTH_TEN
  ),
  REPACK_OWNER_ID_UPPERCASE(
      "5017",
      "Repack owner id "  + Templates.UPPERCASE
  ),
  REPACK_TAG_ID_LENGTH_EXCEEDED(
      "5018",
      "Repack tag id "  + Templates.MAX_LENGTH_TWENTY
  ),
  REPACK_TAG_ID_UPPERCASE(
      "5019",
      "Repack tag id "  + Templates.UPPERCASE
  ),
  REPACK_FROM_CONTAINER_ID_LENGTH_EXCEEDED(
      "5020",
      "Repack from container id "  + Templates.MAX_LENGTH_TWENTY
  ),
  REPACK_FROM_CONTAINER_ID_UPPERCASE(
      "5021",
      "Repack from container id "  + Templates.UPPERCASE
  ),
  REPACK_CONTAINERS_LIST_NOT_EMPTY(
      "5022",
      "Repack containers list " + Templates.NOT_EMPTY
  ),
  REPACK_DETAILS_LIST_NOT_EMPTY(
      "5023",
      "Repack details list " + Templates.NOT_EMPTY
  ),
  REPACK_CONTAINER_WEIGHT_FORMAT(
      "5024",
      "Repack container weight " + Templates.DECIMAL_6_6
  ),
  REPACK_CONTAINER_HEIGHT_FORMAT(
      "5025",
      "Repack container heigth " + Templates.DECIMAL_6_6
  ),
  REPACK_CONTAINER_WIDTH_FORMAT(
      "5026",
      "Repack container width " + Templates.DECIMAL_6_6
  ),
  REPACK_CONTAINER_DEPTH_FORMAT(
      "5027",
      "Repack container depth " + Templates.DECIMAL_6_6
  ),
  REPACK_DETAILS_QTY_FORMAT(
      "5028",
      "Repack details qty " + Templates.DECIMAL_9_6
  ),
  REPACK_DETAILS_KEY_FORMAT(
      "5029",
      "Repack details key " + Templates.INTEGER_10
  ),
  REPACK_DETAILS_LINE_ID_NOT_NULL(
      "5030",
      "Repack line id " + Templates.NOT_NULL
  ),
  REPACK_DETAILS_LINE_ID_FORMAT(
      "5031",
      "Repack line id " + Templates.INTEGER_6
  ),
  REPACK_STATUS_INVALID_VALUE(
      "5032",
      "Repack status must be one of the values: [Open, Closed]"
  ),
  REPACK_DETAILS_KEY_NEGATIVE(
      "5033",
      "Repack details key " + Templates.POSITIVE
  ),
  REPACK_CONTAINER_WEIGHT_NEGATIVE(
      "5034",
      "Repack container weight " + Templates.POSITIVE
  ),
  REPACK_CONTAINER_HEIGHT_NEGATIVE(
      "5035",
      "Repack container heigth " + Templates.POSITIVE
  ),
  REPACK_CONTAINER_WIDTH_NEGATIVE(
      "5036",
      "Repack container width " + Templates.POSITIVE
  ),
  REPACK_CONTAINER_DEPTH_NEGATIVE(
      "5037",
      "Repack container depth " + Templates.POSITIVE
  ),
  REPACK_DETAILS_LINE_ID_NEGATIVE(
      "5038",
      "Repack line id " + Templates.POSITIVE
  ),


  PRINT_NOT_NULL(
      "6000",
      "Print " + Templates.NOT_NULL
  ),
  PRINT_USER_ID_LENGTH_EXCEEDED(
      "6001",
      "Print user id " + Templates.MAX_LENGTH_TWENTY
  ),
  PRINT_USER_ID_UPPERCASE(
      "6002",
      "Print user id "  + Templates.UPPERCASE
  ),
  PRINT_STATION_ID_LENGTH_EXCEEDED(
      "6003",
      "Print station id " + Templates.MAX_LENGTH_TWO_FIFTY_SIX
  ),
  PRINT_STATION_ID_UPPERCASE(
      "6004",
      "Print station id "  + Templates.UPPERCASE
  ),
  PRINT_NAME_NOT_NULL(
      "6005",
      "Print name " + Templates.NOT_NULL
  ),
  PRINT_NAME_LENGTH_EXCEEDED(
      "6006",
      "Print name " + Templates.MAX_LENGTH_TWENTY
  ),
  PRINT_TEMPLATE_LENGTH_EXCEEDED(
      "6007",
      "Print template " + Templates.MAX_LENGTH_TWO_HUNDRED
  ),
  PRINT_EXPORT_TARGET_LENGTH_EXCEEDED(
      "6008",
      "Print export target " + Templates.MAX_LENGTH_TWO_FIFTY
  ),
  PRINT_PARAMETERS_NOT_NULL(
      "6009",
      "Print parameters " + Templates.NOT_NULL
  ),
  PRINT_PARAMETERS_LENGTH_EXCEEDED(
      "6010",
      "Print parameters " + Templates.MAX_LENGTH_FOUR_THOUSAND
  ),
  PRINT_PARAMETERS_UPPERCASE(
      "6011",
      "Print parameters " + Templates.UPPERCASE
  ),
  PRINT_EXPORT_TYPE_LENGTH_EXCEEDED(
      "6012",
      "Print export type " + Templates.MAX_LENGTH_ONE
  ),
  PRINT_EXPORT_TYPE_UPPERCASE(
      "6013",
      "Print export type " + Templates.UPPERCASE
  ),
  PRINT_COPIES_FORMAT(
      "6014",
      "Print copies " + Templates.INTEGER_2
  ),
  PRINT_COPIES_NOT_NEGATIVE(
      "6015",
      "Print copies " + Templates.NOT_NEGATIVE
  ),


  SERIAL_LIST_NOT_NULL(
      "10000",
      "Serial lists " + Templates.NOT_NULL
  ),
  SERIAL_NOT_NULL(
      "10001",
      "Serial " + Templates.NOT_NULL
  ),
  SERIAL_LENGTH_EXCEEDED(
      "10002",
      "Serial number " + Templates.MAX_LENGTH_THIRTY
  ),
  SERIAL_LIST_NOT_EMPTY(
      "10003",
      "Serial lists " + Templates.NOT_EMPTY
  ),

  UNPROCESSABLE_ENTITY("422", "Unprocessable entity"),
  NOT_FOUND("404", "Not found"),
  TECHNICAL_ERROR("500", "Technical error");

  private static final Logger LOGGER = LoggerFactory.getLogger(WMSErrorCode.class);

  private static class Templates {
    private static final String NOT_EMPTY = "must not be empty";
    private static final String NOT_NULL = "must not be null";
    private static final String NOT_NEGATIVE = "must not be negative";
    private static final String MAX_LENGTH_ONE = "maximum length 1";
    private static final String MAX_LENGTH_TWO = "maximum length 2";
    private static final String MAX_LENGTH_THREE = "maximum length 3";
    private static final String MAX_LENGTH_FOUR = "maximum length 4";    
    private static final String MAX_LENGTH_EIGHT = "maximum length 8";
    private static final String MAX_LENGTH_TEN = "maximum length 10";
    private static final String MAX_LENGTH_FOURTEEN = "maximum length 14";
    private static final String MAX_LENGTH_FIFTEEN = "maximum length 15";
    private static final String MAX_LENGTH_SEVENTEEN = "maximum length 17";
    private static final String MAX_LENGTH_EIGHTEEN = "maximum length 18";
    private static final String MAX_LENGTH_TWENTY = "maximum length 20";
    private static final String MAX_LENGTH_TWENTY_FIVE = "maximum length 25";
    private static final String MAX_LENGTH_THIRTY = "maximum length 30";
    private static final String MAX_LENGTH_THIRTY_FIVE = "maximum length 35";
    private static final String MAX_LENGTH_FIFTY = "maximum length 50";
    private static final String MAX_LENGTH_EIGHTY = "maximum length 80";
    private static final String MAX_LENGTH_NINETY_NINE = "maximum length 99";
    private static final String MAX_LENGTH_TWO_HUNDRED = "maximum length 200";
    private static final String MAX_LENGTH_TWO_FIFTY = "maximum length 250";
    private static final String MAX_LENGTH_TWO_FIFTY_SIX = "maximum length 256";
    private static final String MAX_LENGTH_FOUR_THOUSAND = "maximum length 4000";
    private static final String ALPHANUMERIC = "must be alphanumeric";
    private static final String POSITIVE = "must be positive";
    private static final String UPPERCASE = "must be uppercase";
    private static final String NUMERIC = "must be numeric";
    private static final String INTEGER_2 = "must be an integer with at most 2 digits";
    private static final String INTEGER_6 = "must be an integer with at most 6 digits";
    private static final String INTEGER_10 = "must be an integer with at most 10 digits";
    private static final String DECIMAL_6_6 = "must be a decimal number with at most "
        + "6 digits and at most 6 decimals";
    private static final String DECIMAL_7_6 = "must be a decimal number with at most "
        + "7 digits and at most 6 decimals";
    private static final String DECIMAL_4_3 = "must be a decimal number with at most "
        + "4 digits and at most 3 decimals";
    private static final String DECIMAL_9_6 = "must be a decimal number with at most "
        + "9 digits and at most 6 decimals";
    private static final String IDENTIFIER_INCOMPLETE = "must have type/identifier";
    private static final String TYPE_VALUES = "must be one of the values: [PALLET_ID, CONTAINER_ID, TAG_ID]";
  }

  /**
   * Creates a WMSErrorCode instance based on the input parameter.
   *
   * @param code Codes
   * @return WMSErrorCode Instance
   */
  public static WMSErrorCode fromCode(String code) {
    for (WMSErrorCode exCode : values()) {
      if (exCode.code.equals(code)) {
        return exCode;
      }
    }
    LOGGER.error(
        "Could not find an exception code that matches the code: {}. Returning default: {}", code,
        TECHNICAL_ERROR);
    return TECHNICAL_ERROR;
  }

  private final String code;
  private final String message;

  WMSErrorCode(String code, String message) {
    this.code = code;
    this.message = message;
  }

  public String getCode() {
    return code;
  }

  public String getMessage() {
    return message;
  }

  @Override
  public String toString() {
    return this.code + ": " + this.message;
  }
}
