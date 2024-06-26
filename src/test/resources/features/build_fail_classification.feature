Feature: Build Fail Classification
  As a developer
  I want to classify build failures
  So that I can quickly identify and address issues

  Scenario: Classify build as unstable
    Given I have a Jenkins pipeline
    When a condition for unstable build is met
    Then the build should be classified as unstable

  Scenario: Classify build as failed
    Given I have a Jenkins pipeline
    When a condition for build failure is met
    Then the build should be classified as failed

  Scenario: Classify build as aborted
    Given I have a Jenkins pipeline
    When a condition for build abortion is met
    Then the build should be classified as aborted
