package com.binance.api.client.domain.account.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Time of the server running Binance's REST API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DustResponse {
    private String totalServiceCharge;
    private String totalTransferred;
    private List<TransferResult> transferResult;

    public class TransferResult {
        private String amount;

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getFromAsset() {
            return fromAsset;
        }

        public void setFromAsset(String fromAsset) {
            this.fromAsset = fromAsset;
        }

        public Long getOperateTime() {
            return operateTime;
        }

        public void setOperateTime(Long operateTime) {
            this.operateTime = operateTime;
        }

        public String getServiceChargeAmount() {
            return serviceChargeAmount;
        }

        public void setServiceChargeAmount(String serviceChargeAmount) {
            this.serviceChargeAmount = serviceChargeAmount;
        }

        public Long getTranId() {
            return tranId;
        }

        public void setTranId(Long tranId) {
            this.tranId = tranId;
        }

        public String getTransferedAmount() {
            return transferedAmount;
        }

        public void setTransferedAmount(String transferedAmount) {
            this.transferedAmount = transferedAmount;
        }

        private String fromAsset;
        private Long operateTime;
        private String serviceChargeAmount;
        private Long tranId;
        private String transferedAmount;
    }

    public String getTotalServiceCharge() {
        return totalServiceCharge;
    }

    public String getTotalTransferred() {
        return totalTransferred;
    }

    public List<TransferResult> getTransferResult() {
        return transferResult;
    }

    public void setTotalServiceCharge(String totalServiceCharge) {
        this.totalServiceCharge = totalServiceCharge;
    }

    public void setTotalTransferred(String totalTransferred) {
        this.totalTransferred = totalTransferred;
    }

    public void setTransferResult(List<TransferResult> transferResult) {
        this.transferResult = transferResult;
    }
}