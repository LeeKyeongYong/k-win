package com.application.company.port.`in`

import com.application.company.port.`in`.command.CompanyCreateCommand
import com.application.company.port.`in`.command.CompanyUpdateCommand
import com.core.domains.company.Company


interface CompanyUseCase {

    fun createCompany(command: CompanyCreateCommand): Company

    fun findCompanyById(companyId: Long): Company

    fun updateCompany(command: CompanyUpdateCommand): Company

    fun deleteCompanyById(companyId: Long)
}
