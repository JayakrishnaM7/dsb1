package com.ibm.dip.model.saga-node;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * External transfer
 */
@ApiModel(description = "External transfer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-22T11:06:36.097Z[GMT]")

public class Updatepayment   {
  @JsonProperty("PaymentOrderProcedure")
  private String paymentOrderProcedure;

  @JsonProperty("PaymentOrderId")
  private String paymentOrderId;

  @JsonProperty("PaymentTransactionInitiatorReference")
  private String paymentTransactionInitiatorReference;

  @JsonProperty("PayerReference")
  private String payerReference;

  @JsonProperty("PayerBankReference")
  private String payerBankReference;

  @JsonProperty("PayerProductInstanceReference")
  private String payerProductInstanceReference;

  @JsonProperty("PayeeReference")
  private String payeeReference;

  @JsonProperty("PayeeBankReference")
  private String payeeBankReference;

  @JsonProperty("PayeeProductInstanceReference")
  private String payeeProductInstanceReference;

  @JsonProperty("Amount")
  private String amount;

  @JsonProperty("Currency")
  private String currency;

  @JsonProperty("DateType")
  private String dateType;

  @JsonProperty("PaymentMechanismType")
  private String paymentMechanismType;

  @JsonProperty("PaymentInstructions")
  private String paymentInstructions;

  @JsonProperty("InterestedParties")
  private String interestedParties;

  @JsonProperty("ProductType")
  private String productType;

  @JsonProperty("SettlementInstructions")
  private String settlementInstructions;

  public Updatepayment paymentOrderProcedure(String paymentOrderProcedure) {
    this.paymentOrderProcedure = paymentOrderProcedure;
    return this;
  }

  /**
   * Get paymentOrderProcedure
   * @return paymentOrderProcedure
  */
  @ApiModelProperty(value = "")


  public String getPaymentOrderProcedure() {
    return paymentOrderProcedure;
  }

  public void setPaymentOrderProcedure(String paymentOrderProcedure) {
    this.paymentOrderProcedure = paymentOrderProcedure;
  }

  public Updatepayment paymentOrderId(String paymentOrderId) {
    this.paymentOrderId = paymentOrderId;
    return this;
  }

  /**
   * Get paymentOrderId
   * @return paymentOrderId
  */
  @ApiModelProperty(value = "")


  public String getPaymentOrderId() {
    return paymentOrderId;
  }

  public void setPaymentOrderId(String paymentOrderId) {
    this.paymentOrderId = paymentOrderId;
  }

  public Updatepayment paymentTransactionInitiatorReference(String paymentTransactionInitiatorReference) {
    this.paymentTransactionInitiatorReference = paymentTransactionInitiatorReference;
    return this;
  }

  /**
   * Get paymentTransactionInitiatorReference
   * @return paymentTransactionInitiatorReference
  */
  @ApiModelProperty(value = "")


  public String getPaymentTransactionInitiatorReference() {
    return paymentTransactionInitiatorReference;
  }

  public void setPaymentTransactionInitiatorReference(String paymentTransactionInitiatorReference) {
    this.paymentTransactionInitiatorReference = paymentTransactionInitiatorReference;
  }

  public Updatepayment payerReference(String payerReference) {
    this.payerReference = payerReference;
    return this;
  }

  /**
   * Get payerReference
   * @return payerReference
  */
  @ApiModelProperty(value = "")


  public String getPayerReference() {
    return payerReference;
  }

  public void setPayerReference(String payerReference) {
    this.payerReference = payerReference;
  }

  public Updatepayment payerBankReference(String payerBankReference) {
    this.payerBankReference = payerBankReference;
    return this;
  }

  /**
   * Get payerBankReference
   * @return payerBankReference
  */
  @ApiModelProperty(value = "")


  public String getPayerBankReference() {
    return payerBankReference;
  }

  public void setPayerBankReference(String payerBankReference) {
    this.payerBankReference = payerBankReference;
  }

  public Updatepayment payerProductInstanceReference(String payerProductInstanceReference) {
    this.payerProductInstanceReference = payerProductInstanceReference;
    return this;
  }

  /**
   * Get payerProductInstanceReference
   * @return payerProductInstanceReference
  */
  @ApiModelProperty(value = "")


  public String getPayerProductInstanceReference() {
    return payerProductInstanceReference;
  }

  public void setPayerProductInstanceReference(String payerProductInstanceReference) {
    this.payerProductInstanceReference = payerProductInstanceReference;
  }

  public Updatepayment payeeReference(String payeeReference) {
    this.payeeReference = payeeReference;
    return this;
  }

  /**
   * Get payeeReference
   * @return payeeReference
  */
  @ApiModelProperty(value = "")


  public String getPayeeReference() {
    return payeeReference;
  }

  public void setPayeeReference(String payeeReference) {
    this.payeeReference = payeeReference;
  }

  public Updatepayment payeeBankReference(String payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
    return this;
  }

  /**
   * Get payeeBankReference
   * @return payeeBankReference
  */
  @ApiModelProperty(value = "")


  public String getPayeeBankReference() {
    return payeeBankReference;
  }

  public void setPayeeBankReference(String payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
  }

  public Updatepayment payeeProductInstanceReference(String payeeProductInstanceReference) {
    this.payeeProductInstanceReference = payeeProductInstanceReference;
    return this;
  }

  /**
   * Get payeeProductInstanceReference
   * @return payeeProductInstanceReference
  */
  @ApiModelProperty(value = "")


  public String getPayeeProductInstanceReference() {
    return payeeProductInstanceReference;
  }

  public void setPayeeProductInstanceReference(String payeeProductInstanceReference) {
    this.payeeProductInstanceReference = payeeProductInstanceReference;
  }

  public Updatepayment amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @ApiModelProperty(value = "")


  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public Updatepayment currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  @ApiModelProperty(value = "")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Updatepayment dateType(String dateType) {
    this.dateType = dateType;
    return this;
  }

  /**
   * Get dateType
   * @return dateType
  */
  @ApiModelProperty(value = "")


  public String getDateType() {
    return dateType;
  }

  public void setDateType(String dateType) {
    this.dateType = dateType;
  }

  public Updatepayment paymentMechanismType(String paymentMechanismType) {
    this.paymentMechanismType = paymentMechanismType;
    return this;
  }

  /**
   * Get paymentMechanismType
   * @return paymentMechanismType
  */
  @ApiModelProperty(value = "")


  public String getPaymentMechanismType() {
    return paymentMechanismType;
  }

  public void setPaymentMechanismType(String paymentMechanismType) {
    this.paymentMechanismType = paymentMechanismType;
  }

  public Updatepayment paymentInstructions(String paymentInstructions) {
    this.paymentInstructions = paymentInstructions;
    return this;
  }

  /**
   * Get paymentInstructions
   * @return paymentInstructions
  */
  @ApiModelProperty(value = "")


  public String getPaymentInstructions() {
    return paymentInstructions;
  }

  public void setPaymentInstructions(String paymentInstructions) {
    this.paymentInstructions = paymentInstructions;
  }

  public Updatepayment interestedParties(String interestedParties) {
    this.interestedParties = interestedParties;
    return this;
  }

  /**
   * Get interestedParties
   * @return interestedParties
  */
  @ApiModelProperty(value = "")


  public String getInterestedParties() {
    return interestedParties;
  }

  public void setInterestedParties(String interestedParties) {
    this.interestedParties = interestedParties;
  }

  public Updatepayment productType(String productType) {
    this.productType = productType;
    return this;
  }

  /**
   * Get productType
   * @return productType
  */
  @ApiModelProperty(value = "")


  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public Updatepayment settlementInstructions(String settlementInstructions) {
    this.settlementInstructions = settlementInstructions;
    return this;
  }

  /**
   * Get settlementInstructions
   * @return settlementInstructions
  */
  @ApiModelProperty(value = "")


  public String getSettlementInstructions() {
    return settlementInstructions;
  }

  public void setSettlementInstructions(String settlementInstructions) {
    this.settlementInstructions = settlementInstructions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Updatepayment updatepayment = (Updatepayment) o;
    return Objects.equals(this.paymentOrderProcedure, updatepayment.paymentOrderProcedure) &&
        Objects.equals(this.paymentOrderId, updatepayment.paymentOrderId) &&
        Objects.equals(this.paymentTransactionInitiatorReference, updatepayment.paymentTransactionInitiatorReference) &&
        Objects.equals(this.payerReference, updatepayment.payerReference) &&
        Objects.equals(this.payerBankReference, updatepayment.payerBankReference) &&
        Objects.equals(this.payerProductInstanceReference, updatepayment.payerProductInstanceReference) &&
        Objects.equals(this.payeeReference, updatepayment.payeeReference) &&
        Objects.equals(this.payeeBankReference, updatepayment.payeeBankReference) &&
        Objects.equals(this.payeeProductInstanceReference, updatepayment.payeeProductInstanceReference) &&
        Objects.equals(this.amount, updatepayment.amount) &&
        Objects.equals(this.currency, updatepayment.currency) &&
        Objects.equals(this.dateType, updatepayment.dateType) &&
        Objects.equals(this.paymentMechanismType, updatepayment.paymentMechanismType) &&
        Objects.equals(this.paymentInstructions, updatepayment.paymentInstructions) &&
        Objects.equals(this.interestedParties, updatepayment.interestedParties) &&
        Objects.equals(this.productType, updatepayment.productType) &&
        Objects.equals(this.settlementInstructions, updatepayment.settlementInstructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentOrderProcedure, paymentOrderId, paymentTransactionInitiatorReference, payerReference, payerBankReference, payerProductInstanceReference, payeeReference, payeeBankReference, payeeProductInstanceReference, amount, currency, dateType, paymentMechanismType, paymentInstructions, interestedParties, productType, settlementInstructions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Updatepayment {\n");
    
    sb.append("    paymentOrderProcedure: ").append(toIndentedString(paymentOrderProcedure)).append("\n");
    sb.append("    paymentOrderId: ").append(toIndentedString(paymentOrderId)).append("\n");
    sb.append("    paymentTransactionInitiatorReference: ").append(toIndentedString(paymentTransactionInitiatorReference)).append("\n");
    sb.append("    payerReference: ").append(toIndentedString(payerReference)).append("\n");
    sb.append("    payerBankReference: ").append(toIndentedString(payerBankReference)).append("\n");
    sb.append("    payerProductInstanceReference: ").append(toIndentedString(payerProductInstanceReference)).append("\n");
    sb.append("    payeeReference: ").append(toIndentedString(payeeReference)).append("\n");
    sb.append("    payeeBankReference: ").append(toIndentedString(payeeBankReference)).append("\n");
    sb.append("    payeeProductInstanceReference: ").append(toIndentedString(payeeProductInstanceReference)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
    sb.append("    paymentMechanismType: ").append(toIndentedString(paymentMechanismType)).append("\n");
    sb.append("    paymentInstructions: ").append(toIndentedString(paymentInstructions)).append("\n");
    sb.append("    interestedParties: ").append(toIndentedString(interestedParties)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    settlementInstructions: ").append(toIndentedString(settlementInstructions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

