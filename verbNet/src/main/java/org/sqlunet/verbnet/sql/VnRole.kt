/*
 * Copyright (c) 2026. Bernard Bou <1313ou@gmail.com>
 */
package org.sqlunet.verbnet.sql

/**
 * VerbNet role
 *
 * @param roleType              role type
 * @param selectionRestrictions selectional restriction (XML)
 *
 * @author [Bernard Bou](mailto:1313ou@gmail.com)
 */
class VnRole(
    val roleType: String,
    val selectionRestrictions: String?
) 