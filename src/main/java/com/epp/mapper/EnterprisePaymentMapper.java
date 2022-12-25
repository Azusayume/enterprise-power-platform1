package com.epp.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.epp.pojo.EnterprisePayment;
import java.util.List;

import org.apache.ibatis.annotations.*;

@Mapper
public interface EnterprisePaymentMapper {
    //long countByExample(EnterprisePaymentExample example);

    //int deleteByExample(EnterprisePaymentExample example);

    @Delete("delete from enterprise_payment where enterprise_payment_id = #{enterprisePaymentId,jdbcType=INTEGER}")
    int deleteByPrimaryKey(Integer enterprisePaymentId);

    @Insert("  insert into enterprise_payment (enterprise_id, payment, year, \n" +
            "      month, status)\n" +
            "    values (#{enterpriseId,jdbcType=VARCHAR}, #{payment,jdbcType=VARCHAR}, #{year,jdbcType=INTEGER}, \n" +
            "      #{month,jdbcType=INTEGER}, #{status,jdbcType=INTEGER})")
    int insert(EnterprisePayment record);

//    int insertSelective(EnterprisePayment record);

//    List<EnterprisePayment> selectByExample(EnterprisePaymentExample example);

    @Select(" select \n" +
            "    from enterprise_payment\n" +
            "    where enterprise_payment_id = #{enterprisePaymentId,jdbcType=INTEGER}")
    EnterprisePayment selectByPrimaryKey(Integer enterprisePaymentId);

    @Select("select * from enterprise_payment")
    List<EnterprisePayment> selectAll();

    @Select("select * from enterprise_payment")
    IPage<EnterprisePayment> selectAll(Page page);


    ////int updateByExampleSelective(@Param("record") EnterprisePayment record, @Param("example") EnterprisePaymentExample example);

    //int updateByExample(@Param("record") EnterprisePayment record, @Param("example") EnterprisePaymentExample example);

//    int updateByPrimaryKeySelective(EnterprisePayment record);

    @Update("  update enterprise_payment\n" +
            "    set enterprise_id = #{enterpriseId,jdbcType=VARCHAR},\n" +
            "      payment = #{payment,jdbcType=VARCHAR},\n" +
            "      year = #{year,jdbcType=INTEGER},\n" +
            "      month = #{month,jdbcType=INTEGER},\n" +
            "      status = #{status,jdbcType=INTEGER}\n" +
            "    where enterprise_payment_id = #{enterprisePaymentId,jdbcType=INTEGER}")
    int updateByPrimaryKey(EnterprisePayment record);
}