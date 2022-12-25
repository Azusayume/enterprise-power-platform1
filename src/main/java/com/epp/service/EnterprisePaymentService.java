package com.epp.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.epp.pojo.ApiResult;
import com.epp.pojo.EnterprisePayment;

public interface EnterprisePaymentService {
    public ApiResult selectAll();

    public ApiResult selectAll(Page<EnterprisePayment> page);

    public ApiResult selectByPrimaryKey(Integer enterprisePaymentId);

    public ApiResult deleteByPrimaryKey(Integer enterprisePaymentId);

    public ApiResult update(EnterprisePayment EnterprisePayment);

    public ApiResult insert(EnterprisePayment EnterprisePayment);
}
