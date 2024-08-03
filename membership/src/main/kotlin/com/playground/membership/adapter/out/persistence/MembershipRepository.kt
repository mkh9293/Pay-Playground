package com.playground.membership.adapter.out.persistence

import org.springframework.data.jpa.repository.JpaRepository

interface MembershipRepository: JpaRepository<MembershipEntity, Long>